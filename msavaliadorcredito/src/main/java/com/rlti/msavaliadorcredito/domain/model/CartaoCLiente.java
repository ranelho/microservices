package com.rlti.msavaliadorcredito.domain.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoCLiente {
    private String nome;
    private String bandeira;
    private BigDecimal limiteLiberado;
}
