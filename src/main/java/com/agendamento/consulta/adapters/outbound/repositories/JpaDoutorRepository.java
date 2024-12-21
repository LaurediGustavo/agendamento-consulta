package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.DoutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface JpaDoutorRepository extends JpaRepository<DoutorEntity, Long> {

    @Query("SELECT d FROM Doutor d " +
            "WHERE d.nome LIKE %:nome% " +
            "AND (d.desabilitado IS NULL OR d.desabilitado = false) " +
            "ORDER BY d.nome")
    Optional<List<DoutorEntity>> findByNomeContainingAndHabilitado(String nome);

    @Query("SELECT d FROM Doutor d " +
            "WHERE d.nome LIKE %:nome% " +
            "AND d.desabilitado = true " +
            "ORDER BY d.nome")
    Optional<List<DoutorEntity>> findByNomeContainingAndDesabilitado(String nome);

    @Query("SELECT d FROM Doutor d " +
            "JOIN d.procedimentos p " +
            "WHERE d.id NOT IN (SELECT c.doutor.id FROM Consulta c " +
            "WHERE (:dataInicio BETWEEN c.dataHoraInicio AND c.dataHoraFinal) " +
            "OR (:dataFim BETWEEN c.dataHoraInicio AND c.dataHoraFinal)) " +
            "AND (p.id IN (:procedimentosId))" +
            "AND (d.desabilitado IS NULL OR d.desabilitado = false)")
    List<DoutorEntity> findDoutoresDisponiveis(@Param("dataInicio") LocalDateTime dataInicio,
                                               @Param("dataFim") LocalDateTime dataFim,
                                               @Param("procedimentosId") Long[] procedimentoId);

    @Query("SELECT d FROM Doutor d " +
            "JOIN d.procedimentos p " +
            "WHERE ((p.id in (:procedimentosId) " +
            "AND d.nome like %:nome%)) " +
            "AND (d.desabilitado IS NULL OR d.desabilitado = false) ")
    Optional<List<DoutorEntity>> findByNomeAndProcedimentoId(@Param("nome") String nome,
                                                             @Param("procedimentosId") Long[] procedimentoId);

    @Query("SELECT d FROM Doutor d " +
            "JOIN d.procedimentos p " +
            "WHERE p.id in (:procedimentosId) " +
            "AND (d.desabilitado IS NULL OR d.desabilitado = false) ")
    List<DoutorEntity> findAllToProcedureHabilitados(@Param("procedimentosId") Long[] procedimentoId);

}
