package com.agendamento.consulta.domain.usuario;

import java.util.List;

public class UsuarioDomain {

    private Long id;

    private Long consultorioId;

    private String userName;

    private String password;

    private List<RoleDomain> roles;

    private String imagePath;

    public UsuarioDomain() {}

    public UsuarioDomain(Long id,
                         Long consultorioId,
                         String userName,
                         String password,
                         List<RoleDomain> roles,
                         String imagePath) {
        this.id = id;
        this.consultorioId = consultorioId;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
        this.imagePath = imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConsultorioId() {
        return consultorioId;
    }

    public void setConsultorioId(Long consultorioId) {
        this.consultorioId = consultorioId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleDomain> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDomain> roles) {
        this.roles = roles;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
