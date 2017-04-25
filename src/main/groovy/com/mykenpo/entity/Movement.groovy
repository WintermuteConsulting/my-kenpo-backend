package com.mykenpo.entity

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Movement extends AbstractEntity {

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
