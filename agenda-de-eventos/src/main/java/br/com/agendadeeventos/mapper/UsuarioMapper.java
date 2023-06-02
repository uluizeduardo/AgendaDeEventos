package br.com.agendadeeventos.mapper;

import br.com.agendadeeventos.model.dto.request.UsuarioRequest;
import br.com.agendadeeventos.model.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {
    public static final UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    public abstract Usuario converteUsuarioRequestParaUsuario(UsuarioRequest usuarioRequest);

}
