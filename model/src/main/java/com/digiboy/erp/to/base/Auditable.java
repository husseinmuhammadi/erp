package com.digiboy.erp.to.base;

import com.digiboy.erp.to.Audit;

public interface Auditable {

    Audit getAudit();

    void setAudit(Audit audit);
}
