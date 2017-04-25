package com.mykenpo.entity

import org.springframework.data.rest.core.annotation.RestResource

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class TechniqueStep extends AbstractEntity {

    @Column
    int sequence

    @OneToMany(cascade = [CascadeType.ALL])
    @RestResource(exported = false)
    List<Movement> movements

    TechniqueStep() {}

    TechniqueStep(int sequence, List<Movement> movements) {
        this.sequence = sequence
        this.movements = movements
    }
}
