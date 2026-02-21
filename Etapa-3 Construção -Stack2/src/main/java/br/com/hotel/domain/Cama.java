package br.com.hotel.domain;

/**
 * Entidade que representa uma unidade de cama dentro do sistema.
 * É utilizada de forma agregada pela classe Quarto para definir sua configuração.
 */
public class Cama {
    private Long id;
    
    // O tipo de cama (Solteiro, Casal, Beliche, etc.) é definido por um Enum
    // para evitar strings mágicas e erros de digitação.
    private TipoCama tipo;

    /**
     * Construtor padrão (necessário para JPA/Serialização).
     */
    public Cama() {}

    /**
     * Construtor de conveniência para criação rápida do objeto.
     */
    public Cama(Long id, TipoCama tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    // --- Métodos de Acesso ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public TipoCama getTipo() { return tipo; }
    public void setTipo(TipoCama tipo) { this.tipo = tipo; }
}