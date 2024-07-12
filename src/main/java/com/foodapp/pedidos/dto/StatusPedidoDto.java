package com.foodapp.pedidos.dto;

import com.foodapp.pedidos.enums.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusPedidoDto {

    private StatusPedido status;

}
