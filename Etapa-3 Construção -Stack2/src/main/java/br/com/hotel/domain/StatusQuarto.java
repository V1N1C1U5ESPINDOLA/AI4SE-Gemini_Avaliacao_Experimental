package br.com.hotel.domain;

/**
 * Enumeração que define os estados finitos e possíveis de um Quarto.
 * Utilizado para controlar o fluxo de disponibilidade e regras de negócio no sistema.
 */
public enum StatusQuarto {
    
    /** O quarto está pronto para receber novos hóspedes. */
    LIVRE,
    
    /** O quarto possui uma reserva ativa e o hóspede já realizou o check-in. */
    OCUPADO,
    
    /** O quarto apresenta problemas técnicos ou físicos e não pode ser reservado. */
    MANUTENCAO,
    
    /** Estado transitório entre o check-out e a liberação para o próximo hóspede. */
    LIMPEZA
}