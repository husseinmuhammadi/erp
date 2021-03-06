package com.digiboy.erp.to;

import com.digiboy.erp.to.base.Auditable;
import com.digiboy.erp.to.base.EntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends EntityBase implements Auditable {
    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "password", length = 40)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
