package com.agendamento.consulta.adapters.outbound.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public class FuncionarioEntity extends WithConsultorioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -8947289645334051925L;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "sobrenome", length = 100, nullable = false)
    private String sobrenome;

    @Column(name = "data_de_nascimento", nullable = false)
    private LocalDate dataDeNascimento;

    @Column(name = "cpf", length = 15, nullable = false, unique = true)
    private String cpf;

    @Column(name = "genero", length = 50, nullable = false)
    private String genero;

    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;

    @Column(name = "cep", length = 9)
    private String cep;

    @Column(name = "logradouro", length = 100, nullable = false)
    private String logradouro;

    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "bloco", length = 100, nullable = true)
    private String bloco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_funcionario_id")
    private TipoFuncionarioEntity tipoFuncionario;

    @Column(name = "desabilitado")
    private Boolean desabilitado;

    @Column(name = "email")
    private String email;

    @Column(name = "codigoemail", length = 35)
    private String codigoEmail;

}
