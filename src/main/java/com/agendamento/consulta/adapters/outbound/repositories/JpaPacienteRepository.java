package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JpaPacienteRepository extends JpaRepository<PacienteEntity, Long> {

    @Query("SELECT p FROM Paciente p " +
            "WHERE (p.nome LIKE %:nome% OR p.cpf LIKE %:cpf%) " +
            "AND (p.desabilitado IS NULL OR p.desabilitado = false) " +
            "ORDER BY p.nome")
    Optional<List<PacienteEntity>> findByCpfNomeHabilitado(@Param("cpf") String cpf,
                                                           @Param("nome") String nome);

    @Query("SELECT p FROM Paciente p " +
            "WHERE (p.nome LIKE %:nome% OR p.cpf LIKE %:cpf%) " +
            "AND (p.desabilitado = true) " +
            "ORDER BY p.nome")
    Optional<List<PacienteEntity>> findByCpfNomeDesabilitado(@Param("cpf") String cpf,
                                                             @Param("nome") String nome);

    @Query("SELECT p FROM Paciente p " +
            "WHERE p.nome LIKE %:nome% " +
            "AND (p.desabilitado IS NULL OR p.desabilitado = false) ")
    Optional<List<PacienteEntity>> findByNome(@Param("nome") String nome);

    @Query("SELECT p FROM Paciente p " +
            "WHERE p.cpf LIKE :cpf " +
            "AND (p.desabilitado IS NULL OR p.desabilitado = false) " +
            "ORDER BY p.nome")
    Optional<PacienteEntity> findByCpf(String cpf);

    Optional<PacienteEntity> findByChatId(Long chatId);

    boolean existsByCpf(String cpf);

}
