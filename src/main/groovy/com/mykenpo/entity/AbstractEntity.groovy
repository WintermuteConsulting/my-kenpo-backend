package com.mykenpo.entity

import com.mykenpo.audit.TimestampedEntityAuditListener
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate

import javax.persistence.EntityListeners
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.Temporal
import javax.persistence.TemporalType

@MappedSuperclass
@EntityListeners(TimestampedEntityAuditListener)
class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date createdDate

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date lastModifiedDate
}
