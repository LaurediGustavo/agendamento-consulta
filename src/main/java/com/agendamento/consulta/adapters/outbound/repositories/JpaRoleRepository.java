package com.agendamento.consulta.adapters.outbound.repositories;

import com.agendamento.consulta.adapters.outbound.entities.RoleEntity;
import com.agendamento.consulta.adapters.outbound.entities.enumerador.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByRoleName(RoleNameEnum roleNeme);

}
