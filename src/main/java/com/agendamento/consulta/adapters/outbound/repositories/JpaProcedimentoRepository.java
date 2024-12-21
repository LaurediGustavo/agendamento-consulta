package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.ProcedimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaProcedimentoRepository extends JpaRepository<ProcedimentoEntity, Long> {

    @Query("SELECT p FROM Procedimento p " +
            "WHERE p.tratamento LIKE %:tratamento% " +
            "AND (p.desabilitado IS NULL OR p.desabilitado = false) " +
            "ORDER BY p.tratamento")
    Optional<List<ProcedimentoEntity>> findByTratamentoLikeHabilitado(String tratamento);

    @Query("SELECT p FROM Procedimento p " +
            "WHERE p.tratamento LIKE %:tratamento% " +
            "AND (p.desabilitado = true) " +
            "ORDER BY p.tratamento")
    Optional<List<ProcedimentoEntity>> findByTratamentoLikeDesabilitado(String tratamento);

    @Query("SELECT p FROM Procedimento p " +
            "WHERE p.desabilitado IS NULL OR p.desabilitado = false " +
            "ORDER BY p.tratamento")
    List<ProcedimentoEntity> findAllHabilitados();

    @Query("SELECT p FROM Procedimento p " +
            "WHERE p.desabilitado IS NULL OR p.desabilitado = false " +
            "ORDER BY p.id")
    List<ProcedimentoEntity> findAllHabilitadosOrderById();

    @Query("SELECT p FROM Procedimento p " +
            "WHERE p.id = :id " +
            "AND (p.desabilitado IS NULL OR p.desabilitado = false)")
    Optional<ProcedimentoEntity> findByIdHabilitado(@Param("id") Long id);

}
