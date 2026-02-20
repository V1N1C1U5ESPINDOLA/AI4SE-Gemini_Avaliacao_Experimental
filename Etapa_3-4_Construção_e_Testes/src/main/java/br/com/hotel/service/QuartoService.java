package br.com.hotel.service;

import br.com.hotel.domain.*;
import java.util.*;

/**
 * Serviço responsável pela gestão de quartos.
 * Segue princípios SOLID:
 * - SRP: Cada método tem uma responsabilidade única.
 * - OCP: Permite extensão (ex: persistência futura) sem modificar código existente.
 * - DIP: Depende de abstrações (poderia receber um repositório via interface).
 * Clean Code: nomes claros, métodos curtos, sem duplicidade.
 */
public class QuartoService {
    // Simula um repositório em memória. Em produção, use um repository/interface.
    private final List<Quarto> quartos = new ArrayList<>();
    private Long idSequence = 1L;

    /**
     * Cadastra um novo quarto.
     * @param numero Número identificador do quarto
     * @param andar Andar do quarto
     * @param capacidade Capacidade máxima
     * @param precoDiaria Preço da diária
     * @param camas Lista de camas (tipos)
     * @param status Status inicial (Livre, Ocupado, etc)
     * @return Quarto criado
     */
    public Quarto cadastrar(String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        // Validação simples (exemplo de SRP)
        if (numero == null || numero.isEmpty()) throw new IllegalArgumentException("Número obrigatório");
        Quarto quarto = new Quarto(idSequence++, numero, andar, capacidade, precoDiaria, status);
        quarto.setCamas(camas);
        quartos.add(quarto);
        return quarto;
    }

    /**
     * Edita um quarto existente.
     * @param id ID do quarto
     * @param numero Novo número
     * @param andar Novo andar
     * @param capacidade Nova capacidade
     * @param precoDiaria Novo preço
     * @param camas Novas camas
     * @param status Novo status
     * @return Quarto atualizado ou null se não encontrado
     */
    public Quarto editar(Long id, String numero, int andar, int capacidade, double precoDiaria, List<Cama> camas, StatusQuarto status) {
        Quarto quarto = buscarPorId(id);
        if (quarto != null) {
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
     * Lista todos os quartos cadastrados.
     * @return Lista de quartos
     */
    public List<Quarto> listar() {
        // Retorna cópia para evitar exposição da lista interna (encapsulamento)
        return new ArrayList<>(quartos);
    }

    /**
     * Busca um quarto pelo ID.
     * @param id ID do quarto
     * @return Quarto ou null
     */
    public Quarto buscarPorId(Long id) {
        return quartos.stream().filter(q -> q.getId().equals(id)).findFirst().orElse(null);
    }
}
