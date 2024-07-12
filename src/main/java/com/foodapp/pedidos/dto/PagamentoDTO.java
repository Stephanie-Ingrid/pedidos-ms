package com.foodapp.pedidos.dto;

import com.foodapp.pedidos.enums.StatusPagamento;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PagamentoDTO {

    private Long id;

    private BigDecimal valor;

    private String nome;

    private String numero;

    private String expiracao;

    private String codigo;

    private StatusPagamento status;

    private Long formaDePagamentoId;

    private Long pedidoId;

}
