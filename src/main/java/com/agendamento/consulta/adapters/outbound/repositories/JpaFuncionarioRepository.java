package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaFuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

    @Query("SELECT f FROM Funcionario f " +
            "JOIN tipoFuncionario t " +
            "WHERE f.nome LIKE %:nome% " +
            "AND (f.desabilitado IS NULL OR f.desabilitado = false) " +
            "AND t.nome <> 'DOUTOR' " +
            "ORDER BY f.nome ")
    Optional<List<FuncionarioEntity>> findByNomeContainingAndHabilitado(String nome);

    @Query("SELECT f FROM Funcionario f " +
            "JOIN tipoFuncionario t " +
            "WHERE f.nome LIKE %:nome% " +
            "AND (f.desabilitado = true) " +
            "AND t.nome <> 'DOUTOR' " +
            "ORDER BY f.nome ")
    Optional<List<FuncionarioEntity>> findByNomeContainingAndDesabilitado(String nome);

    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);

    Optional<FuncionarioEntity> findByEmail(String email);

}
