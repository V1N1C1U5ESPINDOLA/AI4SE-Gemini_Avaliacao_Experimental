package br.com.hotel.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representa a entidade Quarto no domínio hoteleiro.
 * Esta classe demonstra o conceito de Agregação, onde um Quarto possui uma lista de Camas.
 */
public class Quarto {
    private Long id;
    private String numero;
    private int andar;
    private int capacidade; // Capacidade máxima de pessoas
    private double precoDiaria;
    
    // Relacionamento Um-para-Muitos: Um quarto pode ter várias camas.
    // Inicializado para evitar NullPointerException ao acessar a lista.
    private List<Cama> camas = new ArrayList<>();
    
    // Uso de Enum para garantir a integridade dos estados possíveis do quarto (Livre, Ocupado, Manutenção).
    private StatusQuarto status;

    /**
     * Construtor padrão exigido por frameworks de mapeamento objeto-relacional (ORM).
     */
    public Quarto() {}

    /**
     * Construtor sobrecarregado para facilitar a criação de instâncias com dados iniciais.
     */
    public Quarto(Long id, String numero, int andar, int capacidadade, double precoDiaria, StatusQuarto status) {
        this.id = id;
        this.numero = numero;
        this.andar = andar;
        this.capacidade = capacidadade;
        this.precoDiaria = precoDiaria;
        this.status = status;
    }

    // --- Getters e Setters ---
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public int getAndar() { return andar; }
    public void setAndar(int andar) { this.andar = andar; }
    
    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
    
    public double getPrecoDiaria() { return precoDiaria; }
    public void setPrecoDiaria(double precoDiaria) { this.precoDiaria = precoDiaria; }
    
    /**
     * Retorna a lista de camas associadas ao quarto.
     */
    public List<Cama> getCamas() { return camas; }
    public void setCamas(List<Cama> camas) { this.camas = camas; }
    
    public StatusQuarto getStatus() { return status; }
    public void setStatus(StatusQuarto status) { this.status = status; }

    /**
     * Sobrescrita baseada no ID único (Identidade da Entidade).
     * Fundamental para o funcionamento correto de coleções do tipo Set.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quarto quarto = (Quarto) o;
        return Objects.equals(id, quarto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}