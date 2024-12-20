package com.agendamento.consulta.domain.consulta;

import com.agendamento.consulta.adapters.outbound.entities.enumerador.StatusConsultaEnum;
import com.agendamento.consulta.domain.paciente.PacienteDomain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class ConsultaDomain {

    private Long id;
    private Long consultorioId;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFinal;
    private PacienteDomain paciente;
    private List<ProcedimentoDomain> procedimentos;
    private StatusConsultaEnum status;
    private BigDecimal valorTotal;
    private LocalTime tempoAproximado;
    private ConsultaDomain consultaRemarcadaPara;
    private List<ConsultaDomain> consultasEstendidasPara;
    private List<ConsultaDomain> consultasEstendidasDe;

    public ConsultaDomain() {}

    public ConsultaDomain(Long id,
                          Long consultorioId,
                          LocalDateTime dataHoraInicio,
                          LocalDateTime dataHoraFinal,
                          PacienteDomain paciente,
                          List<ProcedimentoDomain> procedimentos,
                          StatusConsultaEnum status,
                          BigDecimal valorTotal,
                          LocalTime tempoAproximado,
                          ConsultaDomain consultaRemarcadaPara,
                          List<ConsultaDomain> consultasEstendidasPara,
                          List<ConsultaDomain> consultasEstendidasDe) {
        this.id = id;
        this.dataHoraInicio = dataHoraInicio;
        this.consultorioId = consultorioId;
        this.dataHoraFinal = dataHoraFinal;
        this.paciente = paciente;
        this.procedimentos = procedimentos;
        this.status = status;
        this.valorTotal = valorTotal;
        this.tempoAproximado = tempoAproximado;
        this.consultaRemarcadaPara = consultaRemarcadaPara;
        this.consultasEstendidasPara = consultasEstendidasPara;
        this.consultasEstendidasDe = consultasEstendidasDe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultorioId() {
        return consultorioId;
    }

    public void setConsultorioId(Long consultorioId) {
        this.consultorioId = consultorioId;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFinal() {
        return dataHoraFinal;
    }

    public void setDataHoraFinal(LocalDateTime dataHoraFinal) {
        this.dataHoraFinal = dataHoraFinal;
    }

    public PacienteDomain getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteDomain paciente) {
        this.paciente = paciente;
    }

    public List<ProcedimentoDomain> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<ProcedimentoDomain> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public StatusConsultaEnum getStatus() {
        return status;
    }

    public void setStatus(StatusConsultaEnum status) {
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalTime getTempoAproximado() {
        return tempoAproximado;
    }

    public void setTempoAproximado(LocalTime tempoAproximado) {
        this.tempoAproximado = tempoAproximado;
    }

    public ConsultaDomain getConsultaRemarcadaPara() {
        return consultaRemarcadaPara;
    }

    public void setConsultaRemarcadaPara(ConsultaDomain consultaRemarcadaPara) {
        this.consultaRemarcadaPara = consultaRemarcadaPara;
    }

    public List<ConsultaDomain> getConsultasEstendidasPara() {
        return consultasEstendidasPara;
    }

    public void setConsultasEstendidasPara(List<ConsultaDomain> consultasEstendidasPara) {
        this.consultasEstendidasPara = consultasEstendidasPara;
    }

    public List<ConsultaDomain> getConsultasEstendidasDe() {
        return consultasEstendidasDe;
    }

    public void setConsultasEstendidasDe(List<ConsultaDomain> consultasEstendidasDe) {
        this.consultasEstendidasDe = consultasEstendidasDe;
    }
}
