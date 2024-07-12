package com.foodapp.pedidos.amqp;

import com.foodapp.pedidos.dto.PagamentoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PagamentoListener {

    @RabbitListener(queues = "pagamento.detalhes-pedido")
    public void recebeMensagem(PagamentoDTO pagamentoDTO){

        String mensagem =
                """
                Nome: %s
                Dados do pagamento: %s
                Numero do pedido: %s
                Valor R$: %s
                Status: %s
                """.formatted(pagamentoDTO.getNome(),
                        pagamentoDTO.getId(),
                        pagamentoDTO.getPedidoId(),
                        pagamentoDTO.getValor(),
                        pagamentoDTO.getStatus());

        System.out.println("Pagamento recebido " + mensagem);

    }

}
