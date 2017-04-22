package com.mykenpo.entity

import org.springframework.data.rest.core.annotation.RestResource

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
 class Technique {

    @Id
    @GeneratedValue
    long id

    @Column(nullable=false)
    String name

    @OneToMany
    Collection<TechniqueStep> techniqueSteps

    @ManyToOne(cascade = [CascadeType.ALL])
    @RestResource(exported = false)
    Attack attack
}
