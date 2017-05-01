package com.mykenpo.audit

import com.mykenpo.entity.AbstractEntity
import org.springframework.beans.factory.annotation.Configurable

import javax.persistence.PrePersist
import javax.persistence.PreUpdate

@Configurable
class TimestampedEntityAuditListener {

    @PrePersist
    void touchForCreate(AbstractEntity target) {
        Date now = new Date()
        target.createdDate = now
        target.lastModifiedDate = now
    }

    @PreUpdate
    void touchForUpdate(AbstractEntity target) {
        target.lastModifiedDate = new Date()
    }
}
