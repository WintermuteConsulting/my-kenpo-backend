package com.mykenpo.entity

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Attack extends AbstractEntity {

    @Column(nullable = false, unique = true)
    String text

    Attack() {}

    Attack(String text) {
        this.text = text
    }
}
