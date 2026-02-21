package br.com.hotel.controller;

import br.com.hotel.domain.*;
import br.com.hotel.service.QuartoService;
import java.util.*;

/**
 * Controller responsável por expor as funcionalidades de gestão de quartos.
 * Atua como ponto de entrada para as requisições da interface de usuário.
 */
public class QuartoController {
    
    // Dependência da camada de serviço. 
    // Em sistemas reais, costuma ser injetada via Inversão de Controle (IoC).
    private final QuartoService quartoService = new QuartoService();

    /**
     * Delegar o cadastro de um novo quarto para a camada de serviço.
     */
    public Quarto cadastrarQuarto(String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        return quartoService.cadastrar(numero, andar, capacidade, precoDiaria, camas, status);
    }

    /**
     * Atualiza os dados de um quarto existente com base no seu identificador.
     */
    public Quarto editarQuarto(Long id, String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        return quartoService.editar(id, numero, andar, capacidade, precoDiaria, camas, status);
    }

    /**
     * Retorna uma lista de quartos formatada como DTO (Data Transfer Object) improvisado.
     * Esta lógica de mapeamento transforma objetos de domínio em Mapas para facilitar 
     * a exibição em interfaces ou retornos JSON.
     */
    public List<Map<String, Object>> listarQuartos() {
        List<Map<String, Object>> resultado = new ArrayList<>();
        
        for (Quarto q : quartoService.listar()) {
            Map<String, Object> info = new HashMap<>();
            
            // Mapeamento manual de atributos para a View
            info.put("numero", q.getNumero());
            
            // Regra de apresentação: Define o tipo com base na capacidade
            info.put("tipo", q.getCapacidade() > 2 ? "Familiar" : "Simples");
            
            // Cálculo de exibição: Conversão de diária para valor por hora
            info.put("precoPorHora", q.getPrecoDiaria() / 24.0);
            
            info.put("disponibilidade", q.getStatus());
            
            // Tratamento da lista de objetos Cama para uma lista de Strings (nomes dos tipos)
            List<String> camasStr = new ArrayList<>();
            for (Cama cama : q.getCamas()) {
                camasStr.add(cama.getTipo().name());
            }
            info.put("camas", camasStr);
            
            resultado.add(info);
        }
        return resultado;
    }
}