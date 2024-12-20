package com.agendamento.consulta.domain.usuario;

import com.agendamento.consulta.adapters.outbound.entities.enumerador.RoleNameEnum;

public class RoleDomain {

    private Long id;

    private RoleNameEnum roleName;

    public RoleDomain() {}

    public RoleDomain(Long id, RoleNameEnum roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleNameEnum getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleNameEnum roleName) {
        this.roleName = roleName;
    }
}
