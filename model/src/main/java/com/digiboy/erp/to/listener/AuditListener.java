package com.digiboy.erp.to.listener;

import com.digiboy.erp.to.Audit;
import com.digiboy.erp.to.base.Auditable;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class AuditListener {

    @PrePersist
    public void setCreatedOn(Auditable auditable) {
        Audit audit = auditable.getAudit();

        if (audit == null) {
            audit = new Audit();
            auditable.setAudit(audit);
        }

        // audit.setCreatedOn(LocalDateTime.now());
        audit.setCreatedOn(new Date());
        audit.setCreatedBy(/*LoggedUser.get()*/ "");
    }

    @PreUpdate
    public void setUpdatedOn(Auditable auditable) {
        Audit audit = auditable.getAudit();

        // audit.setUpdatedOn(LocalDateTime.now());
        audit.setUpdatedOn(new Date());
        audit.setUpdatedBy(/*LoggedUser.get()*/ "");
    }
}
