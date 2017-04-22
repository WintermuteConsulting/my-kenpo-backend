package com.mykenpo.entity

import org.springframework.data.rest.core.annotation.RestResource

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
class Technique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id

    @Column(nullable = false)
    String name

    @Column
    String alternateName

    @OneToMany(cascade = [CascadeType.ALL])
    @RestResource(exported = false)
    List<TechniqueStep> techniqueSteps

    @ManyToOne(cascade = [CascadeType.ALL])
    @RestResource(exported = false)
    Attack attack

    Technique() { }

    Technique(String name, String alternateName,
              Collection<TechniqueStep> steps,
              Attack attack) {
        this.name = name
        this.alternateName = alternateName
        this.techniqueSteps = steps
        this.attack = attack
    }
}
