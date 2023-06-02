package br.com.agendadeeventos.model.dto.request;

import br.com.agendadeeventos.model.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    private EnderecoRequest endereco;
}
