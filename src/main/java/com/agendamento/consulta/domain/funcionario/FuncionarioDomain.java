package com.agendamento.consulta.domain.funcionario;

import java.time.LocalDate;

public class FuncionarioDomain {

    private Long id;
    private Long consultorioId;
    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String genero;
    private String telefone;
    private String cep;
    private String logradouro;
    private String bairro;
    private Integer numero;
    private String bloco;
    private TipoFuncionarioDomain tipoFuncionario;
    private Boolean desabilitado;
    private String email;
    private String codigoEmail;

    public FuncionarioDomain() {}

    public FuncionarioDomain(Long id,
                             Long consultorioId,
                             String nome,
                             String sobrenome,
                             LocalDate dataDeNascimento,
                             String cpf,
                             String genero,
                             String telefone,
                             String cep,
                             String logradouro,
                             String bairro,
                             Integer numero,
                             String bloco,
                             TipoFuncionarioDomain tipoFuncionario,
                             Boolean desabilitado,
                             String email,
                             String codigoEmail) {
        this.id = id;
        this.consultorioId = consultorioId;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.telefone = telefone;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.bloco = bloco;
        this.tipoFuncionario = tipoFuncionario;
        this.desabilitado = desabilitado;
        this.email = email;
        this.codigoEmail = codigoEmail;
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

    public TipoFuncionarioDomain getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionarioDomain tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public Boolean getDesabilitado() {
        return desabilitado;
    }

    public void setDesabilitado(Boolean desabilitado) {
        this.desabilitado = desabilitado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoEmail() {
        return codigoEmail;
    }

    public void setCodigoEmail(String codigoEmail) {
        this.codigoEmail = codigoEmail;
    }
}
