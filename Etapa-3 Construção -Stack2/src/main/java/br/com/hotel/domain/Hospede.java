package br.com.hotel.domain;

import java.util.Objects;

/**
 * Classe de domínio que representa a entidade Hóspede no sistema de hotelaria.
 * Esta é uma classe POJO (Plain Old Java Object) que segue o padrão de encapsulamento.
 */
public class Hospede {
    
    // Atributos privados para garantir o encapsulamento
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    /**
     * Construtor padrão (sem argumentos). 
     * Essencial para frameworks de persistência (como JPA/Hibernate) e serialização.
     */
    public Hospede() {}

    /**
     * Construtor completo para instanciar o objeto com todos os dados.
     */
    public Hospede(Long id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos Assessores (Getters) e Modificadores (Setters)
    // Permitem o acesso controlado aos atributos da classe.
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    /**
     * Sobrescrita do método equals para comparar se dois hóspedes são logicamente iguais.
     * Neste caso, a igualdade é definida pelo 'id' (identidade única).
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se é a mesma referência de memória
        if (o == null || getClass() != o.getClass()) return false; // Verifica nulidade e tipo da classe
        Hospede hospede = (Hospede) o;
        return Objects.equals(id, hospede.id); // Comparação baseada no identificador único
    }

    /**
     * Sobrescrita do hashCode. Essencial ao usar a classe em coleções 
     * que utilizam hash, como HashSet ou HashMap.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}