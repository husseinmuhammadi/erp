package com.digiboy.erp.to.base;

import com.digiboy.erp.to.Audit;
import com.digiboy.erp.to.listener.EntityLogger;

import javax.persistence.*;

@MappedSuperclass
@EntityListeners(EntityLogger.class)
public abstract class EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GENERATOR")
    private Long id;

    @Version
    @Column(nullable = false, columnDefinition = "NUMERIC(19,0) default 0")
    private Long version;

    @Column(name = "DESCRIPTION", length = 300)
    private String description;

    @Embedded
    private Audit audit;

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
