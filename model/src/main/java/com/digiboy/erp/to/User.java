package com.digiboy.erp.to;

import com.digiboy.erp.to.base.Auditable;
import com.digiboy.erp.to.base.EntityBase;
import com.digiboy.erp.to.listener.AuditListener;

import javax.persistence.*;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "SEQ_USER")
@EntityListeners(AuditListener.class)
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
