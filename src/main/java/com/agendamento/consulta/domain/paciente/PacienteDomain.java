package com.agendamento.consulta.domain.paciente;

import java.time.LocalDate;

public class PacienteDomain {

    private Long id;
    private Long consultorioId;
    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String genero;
    private String telefone;
    private String informacoesAdicionais;
    private String cep;
    private String logradouro;
    private String bairro;
    private Integer numero;
    private String bloco;
    private String parentesco;
    private PacienteDomain responsavelPacienteId;
    private Long chatId;
    private Boolean desabilitado;

    public PacienteDomain() {}

    public PacienteDomain(Long id,
                          Long consultorioId,
                          String nome,
                          String sobrenome,
                          LocalDate dataDeNascimento,
                          String cpf,
                          String genero,
                          String telefone,
                          String informacoesAdicionais,
                          String cep,
                          String logradouro,
                          String bairro,
                          Integer numero,
                          String bloco,
                          String parentesco,
                          PacienteDomain responsavelPacienteId,
                          Long chatId,
                          Boolean desabilitado) {
        this.id = id;
        this.consultorioId = consultorioId;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.telefone = telefone;
        this.informacoesAdicionais = informacoesAdicionais;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.bloco = bloco;
        this.parentesco = parentesco;
        this.responsavelPacienteId = responsavelPacienteId;
        this.chatId = chatId;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public PacienteDomain getResponsavelPacienteId() {
        return responsavelPacienteId;
    }

    public void setResponsavelPacienteId(PacienteDomain responsavelPacienteId) {
        this.responsavelPacienteId = responsavelPacienteId;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Boolean getDesabilitado() {
        return desabilitado;
    }

    public void setDesabilitado(Boolean desabilitado) {
        this.desabilitado = desabilitado;
    }
}
