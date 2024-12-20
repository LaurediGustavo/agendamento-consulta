package com.agendamento.consulta.adapters.outbound.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "tipo_funcionario")
public class TipoFuncionarioEntity extends WithoutConsultorioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 5250274804581516314L;

    @Column(name = "nome", length = 100, nullable = false, unique = true)
    private String nome;

}
