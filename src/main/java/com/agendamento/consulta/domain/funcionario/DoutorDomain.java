package com.agendamento.consulta.domain.funcionario;

import com.agendamento.consulta.domain.consulta.ProcedimentoDomain;

import java.time.LocalDate;
import java.util.List;

public class DoutorDomain extends FuncionarioDomain {

    private String cro;
    private List<ProcedimentoDomain> procedimentos;

    public DoutorDomain() {}

    public DoutorDomain(Long id,
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
                        String cro,
                        Boolean desabilitado,
                        String email) {
        super(id, nome, sobrenome, dataDeNascimento, cpf, genero, telefone, cep, logradouro, bairro, numero, bloco, tipoFuncionario, desabilitado, email, null);
        this.cro = cro;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public List<ProcedimentoDomain> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<ProcedimentoDomain> procedimentos) {
        this.procedimentos = procedimentos;
    }
}
