package br.com.agendadeeventos.mapper;

import br.com.agendadeeventos.model.dto.request.EnderecoRequest;
import br.com.agendadeeventos.model.dto.request.UsuarioRequest;
import br.com.agendadeeventos.model.entity.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UsuarioMapperTest {
    @Test
    void converteUsuarioRequestParaUsuario_ComSucesso(){
        //cenario
        UsuarioRequest usuarioRequest = new UsuarioRequest();
        usuarioRequest.setCpf("12345678910");
        usuarioRequest.setEmail("teste@teste");
        usuarioRequest.setNome("Joaquim");
        usuarioRequest.setTelefone("81994323333");

        EnderecoRequest enderecoRequest = EnderecoRequest.builder()
                .estado("Pernambuco")
                .cidade("Carpina")
                .rua("rua 06")
                .numero("73")
                .pontoDeReferencia("Rua principal")
                .build();

        usuarioRequest.setEndereco(enderecoRequest);

        //ação
        Usuario usuario = UsuarioMapper.INSTANCE.converteUsuarioRequestParaUsuario(usuarioRequest);

        //verificação
        Assertions.assertNotNull(usuario);
        Assertions.assertEquals(usuarioRequest.getNome(),usuario.getNome());
    }
}