package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.TipoFuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTipoFuncionarioRepository extends JpaRepository<TipoFuncionarioEntity, Long> {

    TipoFuncionarioEntity findByNome(String nome);

}
