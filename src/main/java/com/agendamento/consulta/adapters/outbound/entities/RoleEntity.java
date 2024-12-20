package com.agendamento.consulta.adapters.outbound.entities;

import com.agendamento.consulta.adapters.outbound.entities.enumerador.RoleNameEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "role")
public class RoleEntity extends WithoutConsultorioEntity implements Serializable, GrantedAuthority {

    @Serial
    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name", nullable = false, unique = true)
    private RoleNameEnum roleName;

    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }

}
