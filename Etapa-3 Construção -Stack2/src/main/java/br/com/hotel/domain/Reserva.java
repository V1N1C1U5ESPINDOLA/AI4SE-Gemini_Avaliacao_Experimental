package br.com.hotel.domain;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Entidade que representa o vínculo contratual entre um Hóspede e um Quarto.
 * Esta classe é o "coração" do sistema de reservas, agregando as principais entidades do domínio.
 */
public class Reserva {
    private Long id;
    
    // Associação: A reserva precisa de um quarto específico.
    private Quarto quarto;
    
    // Associação: A reserva deve estar vinculada a um hóspede cadastrado.
    private Hospede hospede;
    
    // Uso da API java.time (moderna) para manipulação de datas, evitando problemas de fuso horário e cálculos manuais.
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    
    // Atributo derivado ou calculado que representa o custo total do período reservado.
    private double valorTotal;

    /**
     * Construtor padrão para frameworks de persistência.
     */
    public Reserva() {}

    /**
     * Construtor completo para inicialização de novas reservas via serviço ou repositório.
     */
    public Reserva(Long id, Quarto quarto, Hospede hospede, LocalDate dataEntrada, LocalDate dataSaida, double valorTotal) {
        this.id = id;
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valorTotal = valorTotal;
    }

    // --- Getters e Setters ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Quarto getQuarto() { return quarto; }
    public void setQuarto(Quarto quarto) { this.quarto = quarto; }

    public Hospede getHospede() { return hospede; }
    public void setHospede(Hospede hospede) { this.hospede = hospede; }

    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }

    public LocalDate getDataSaida() { return dataSaida; }
    public void setDataSaida(LocalDate dataSaida) { this.dataSaida = dataSaida; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    /**
     * Comparação lógica de reservas baseada no identificador único.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(id, reserva.id);
    }

    /**
     * Gera o código hash para uso em estruturas de dados indexadas.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}