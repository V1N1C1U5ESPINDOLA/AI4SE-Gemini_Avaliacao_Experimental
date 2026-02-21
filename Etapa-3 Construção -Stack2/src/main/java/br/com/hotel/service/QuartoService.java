package br.com.hotel.service;

import br.com.hotel.domain.*;
import java.util.*;

/**
 * Camada de serviço responsável pelo gerenciamento da lógica de negócio de Quartos.
 * Implementa o padrão de persistência em memória para fins de prototipagem.
 */
public class QuartoService {
    
    // Armazenamento em memória (simulando uma tabela de banco de dados).
    private final List<Quarto> quartos = new ArrayList<>();
    
    // Simulador de chave primária autoincrementada (Identity).
    private Long idSequence = 1L;

    /**
     * Realiza o registro de um novo quarto no sistema.
     * @return O objeto Quarto com o ID gerado e as camas associadas.
     */
    public Quarto cadastrar(String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        // Aplicação da sequência de ID e criação da instância.
        Quarto quarto = new Quarto(idSequence++, numero, andar, capacidade, precoDiaria, status);
        quarto.setCamas(camas); // Associação da lista de camas ao quarto.
        quartos.add(quarto);
        return quarto;
    }

    /**
     * Atualiza os dados de um quarto existente.
     * @param id Identificador único para busca.
     * @return O objeto atualizado ou null caso o ID não exista.
     */
    public Quarto editar(Long id, String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        Quarto quarto = buscarPorId(id);
        if (quarto != null) {
            // Atualização dos campos (Mutação de estado).
            quarto.setNumero(numero);
            quarto.setAndar(andar);
            quarto.setCapacidade(capacidade);
            quarto.setPrecoDiaria(precoDiaria);
            quarto.setCamas(camas);
            quarto.setStatus(status);
        }
        return quarto;
    }

    /**
     * Retorna todos os quartos cadastrados.
     * @return Uma nova lista contendo as referências para garantir o encapsulamento da lista original.
     */
    public List<Quarto> listar() {
        return new ArrayList<>(quartos);
    }

    /**
     * Recupera um quarto específico utilizando a API de Streams do Java.
     * @param id ID do quarto.
     * @return O quarto encontrado ou null.
     */
    public Quarto buscarPorId(Long id) {
        // Filtragem funcional para encontrar a primeira ocorrência do ID.
        return quartos.stream()
                      .filter(q -> q.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }
}