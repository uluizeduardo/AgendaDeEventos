package br.com.agendadeeventos.mapper;

import br.com.agendadeeventos.model.dto.request.EnderecoRequest;
import br.com.agendadeeventos.model.entity.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class EnderecoMapper {
    public static final EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    public abstract Endereco converteEnderecoRequestParaEndereco(EnderecoRequest enderecoRequest);
}
