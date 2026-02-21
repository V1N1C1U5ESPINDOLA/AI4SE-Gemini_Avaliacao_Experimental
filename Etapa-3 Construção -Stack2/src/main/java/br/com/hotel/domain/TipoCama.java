package br.com.hotel.domain;

/**
 * Define as categorias padronizadas de camas disponíveis no hotel.
 * Este Enum auxilia no cálculo da capacidade máxima de hóspedes por quarto.
 */
public enum TipoCama {
    
    /** Cama individual padrão. Geralmente conta como capacidade para 1 pessoa. */
    SOLTEIRO,
    
    /** Cama de casal com dimensões máximas (aprox. 1,93m x 2,03m). */
    KING,
    
    /** Cama de casal com dimensões intermediárias (aprox. 1,58m x 1,98m). */
    QUEEN
}