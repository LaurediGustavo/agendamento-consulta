package com.agendamento.consulta.adapters.outbound.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "doutor")
public class DoutorEntity extends FuncionarioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1415402698004881580L;

    @Column(name = "cro", length = 20, nullable = false, unique = true)
    private String cro;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "doutor_procedimento",
            joinColumns = @JoinColumn(name = "doutor_id"),
            inverseJoinColumns = @JoinColumn(name = "procedimento_id")
    )
    private List<ProcedimentoEntity> procedimentos;

}
