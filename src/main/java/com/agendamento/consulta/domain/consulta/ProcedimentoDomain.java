package com.agendamento.consulta.domain.consulta;

import java.math.BigDecimal;

public class ProcedimentoDomain {

    private Long id;
    private Long consultorioId;
    private String tratamento;
    private String tempo;
    private BigDecimal valor;
    private Boolean desabilitado;

    public ProcedimentoDomain() {}

    public ProcedimentoDomain(Long id,
                              Long consultorioId,
                              String tratamento,
                              String tempo,
                              BigDecimal valor,
                              Boolean desabilitado) {
        this.id = id;
        this.consultorioId = consultorioId;
        this.tratamento = tratamento;
        this.tempo = tempo;
        this.valor = valor;
        this.desabilitado = desabilitado;
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

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Boolean getDesabilitado() {
        return desabilitado;
    }

    public void setDesabilitado(Boolean desabilitado) {
        this.desabilitado = desabilitado;
    }
}
