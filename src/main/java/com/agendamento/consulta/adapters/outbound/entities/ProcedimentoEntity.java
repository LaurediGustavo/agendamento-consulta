package com.agendamento.consulta.adapters.outbound.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "procedimento")
public class ProcedimentoEntity extends WithConsultorioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 5288062917051456982L;

    @Column(name = "tratamento", length = 100, nullable = false)
    private String tratamento;

    @Column(name = "tempo", length = 100, nullable = false)
    private String tempo;

    @Column(name = "valor", precision = 18, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(name = "desabilitado")
    private Boolean desabilitado;

}
