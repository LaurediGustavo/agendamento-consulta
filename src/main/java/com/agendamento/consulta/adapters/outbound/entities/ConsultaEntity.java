package com.agendamento.consulta.adapters.outbound.entities;

import com.agendamento.consulta.adapters.outbound.entities.enumerador.StatusConsultaEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "consulta")
public class ConsultaEntity extends WithConsultorioEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 8249491343728395751L;

    @Column(name = "datahorainicio", nullable = false)
    private LocalDateTime dataHoraInicio;

    @Column(name = "datahorafinal", nullable = false)
    private LocalDateTime dataHoraFinal;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "doutor_id", nullable = false)
    private DoutorEntity doutor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "consulta_procedimento",
            joinColumns = @JoinColumn(name = "consulta_id"),
            inverseJoinColumns = @JoinColumn(name = "procedimento_id")
    )
    private List<ProcedimentoEntity> procedimentos;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusConsultaEnum status;

    @Column(name = "valortotal", nullable = false)
    private BigDecimal valorTotal;

    @Column(name = "tempoaproximado", nullable = false)
    private LocalTime tempoAproximado;

    @ManyToOne
    @JoinColumn(name = "consultaremarcadapara_id")
    private ConsultaEntity consultaRemarcadaPara;

    @ManyToMany
    @JoinTable(
            name = "consulta_estendida",
            joinColumns = @JoinColumn(name = "consultaestendidade_id"),
            inverseJoinColumns = @JoinColumn(name = "consultaestendidapara_id")
    )
    private List<ConsultaEntity> consultasEstendidasPara;

    @ManyToMany
    @JoinTable(
            name = "consulta_estendida",
            joinColumns = @JoinColumn(name = "consultaestendidapara_id"),
            inverseJoinColumns = @JoinColumn(name = "consultaestendidade_id")
    )
    private List<ConsultaEntity> consultasEstendidasDe;

}
