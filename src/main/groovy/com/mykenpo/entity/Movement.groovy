package com.mykenpo.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id

    @Column
    int sequence

    @Column
    String move

    Movement() { }

    Movement(int sequence, String move) {
        this.sequence = sequence
        this.move = move
    }
}
