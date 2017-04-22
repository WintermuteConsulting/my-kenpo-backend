package com.mykenpo.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Column
import javax.persistence.OneToMany

@Entity
 class TechniqueStep {

    @Id
    @GeneratedValue
    long id

    @Column
    int sequence

    @OneToMany
    List<TechniqueAction> techniqueActions
}
