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
@Table(name = "paciente")
public class PacienteEntity extends WithConsultorioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -3304973319884070682L;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "sobrenome", length = 100, nullable = false)
    private String sobrenome;

    @Column(name = "dataDeNascimento", nullable = true)
    private LocalDate dataDeNascimento;

    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "genero", length = 50, nullable = true)
    private String genero;

    @Column(name = "telefone", length = 15, nullable = true)
    private String telefone;

    @Column(name = "informacoesadicionais", length = 1000, nullable = true)
    private String informacoesAdicionais;

    @Column(name = "cep", length = 9)
    private String cep;

    @Column(name = "logradouro", length = 100, nullable = true)
    private String logradouro;

    @Column(name = "bairro", length = 100, nullable = true)
    private String bairro;

    @Column(name = "numero", nullable = true)
    private Integer numero;

    @Column(name = "bloco", length = 100, nullable = true)
    private String bloco;

    @Column(name = "parentesco", length = 50, nullable = true)
    private String parentesco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "responsavel_paciente_id", nullable = true)
    private PacienteEntity responsavelPacienteId;

    @Column(name = "chat_id", length = 50, nullable = true)
    private Long chatId;

    @Column(name = "desabilitado")
    private Boolean desabilitado;

}
