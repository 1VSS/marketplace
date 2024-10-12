package com.vss.marketplace.infrastructure.persistence.Jpa.user;

import com.vss.marketplace.Domain.enums.rolesEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_USER")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private rolesEnum role;

    public UserEntity(Long id, String name, String email, String password, rolesEnum role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public rolesEnum getRole() {
        return role;
    }

    public void setRole(rolesEnum role) {
        this.role = role;
    }
}
