package br.com.agendadeeventos.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    @Id
    private Long id;

    private String estado;

    private String cidade;

    private String rua;

    private String numero;

    private String pontoDeReferencia;

}
