package br.com.agendadeeventos.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    @OneToOne
    private Endereco endereco;

}
