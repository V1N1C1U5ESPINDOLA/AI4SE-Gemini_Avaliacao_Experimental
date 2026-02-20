package br.com.hotel.controller;

import br.com.hotel.domain.*;
import br.com.hotel.service.QuartoService;
import java.util.*;

/**
 * Controller de quartos (simulação, sem framework REST).
 * Princípios SOLID:
 * - SRP: Cada método expõe uma operação do domínio.
 * - DIP: Depende de QuartoService (poderia ser interface).
 * Clean Code: nomes claros, sem lógica duplicada, métodos curtos.
 */
public class QuartoController {
    private final QuartoService quartoService = new QuartoService();

    /**
     * Endpoint de cadastro de quarto.
     */
    public Quarto cadastrarQuarto(String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        return quartoService.cadastrar(numero, andar, capacidade, precoDiaria, camas, status);
    }

    /**
     * Endpoint de edição de quarto.
     */
    public Quarto editarQuarto(Long id, String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        return quartoService.editar(id, numero, andar, capacidade, precoDiaria, camas, status);
    }

    /**
     * Endpoint de listagem de quartos.
     * Retorna apenas dados relevantes para exibição.
     */
    public List<Map<String, Object>> listarQuartos() {
        List<Map<String, Object>> resultado = new ArrayList<>();
        for (Quarto q : quartoService.listar()) {
            Map<String, Object> info = new HashMap<>();
            info.put("numero", q.getNumero());
            // Exemplo de lógica de apresentação separada do domínio
            info.put("tipo", q.getCapacidade() > 2 ? "Familiar" : "Simples");
            info.put("precoPorHora", q.getPrecoDiaria() / 24.0);
            info.put("disponibilidade", q.getStatus());
            List<String> camas = new ArrayList<>();
            for (Cama cama : q.getCamas()) {
                camas.add(cama.getTipo().name());
            }
            info.put("camas", camas);
            resultado.add(info);
        }
        return resultado;
    }
}
