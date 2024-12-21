package com.agendamento.consulta.adapters.outbound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "consulta_estendida")
public class ConsultaEstendidaEntity extends WithoutConsultorioEntity implements Serializable {

    @ManyToOne
    @JoinColumn(name = "consultaestendidade_id", referencedColumnName = "id")
    private ConsultaEntity consultaEstendidaDe;

    @ManyToOne
    @JoinColumn(name = "consultaestendidapara_id", referencedColumnName = "id")
    private ConsultaEntity consultaEstendidaPara;

}
