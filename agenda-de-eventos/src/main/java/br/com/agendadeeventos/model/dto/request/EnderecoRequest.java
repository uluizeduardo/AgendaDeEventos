package br.com.agendadeeventos.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoRequest {

    private String estado;

    private String cidade;

    private String rua;

    private String numero;

    private String pontoDeReferencia;

}
