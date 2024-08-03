package com.houseoffourleaf.ecommerce.service;

import com.houseoffourleaf.ecommerce.entity.Audit;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditService {

    public void setAuditData(Audit audit, String loginUser) {
        setCreateAudit(audit, loginUser);
        setUpdateAudit(audit, loginUser);
    }

    public void setCreateAudit(Audit audit, String loginUser) {
        audit.setInsertUser(loginUser);
        audit.setInsertTimestamp(LocalDateTime.now());
    }

    public void setUpdateAudit(Audit audit, String loginUser) {
        audit.setUpdateUser(loginUser);
        audit.setUpdateTimestamp(LocalDateTime.now());
    }
}
