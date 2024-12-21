package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.ConsultaEntity;
import com.agendamento.consulta.adapters.outbound.entities.ConsultaEstendidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaConsultaEstendidaRepository extends JpaRepository<ConsultaEstendidaEntity, Long> {

    @Query("SELECT c.consultaEstendidaDe FROM ConsultaEstendida c " +
            "INNER JOIN c.consultaEstendidaPara cp " +
            "WHERE cp.id = :id ")
    Optional<ConsultaEntity> consultarConsultaDePorPara(@Param("id") Long consultaId);

}
