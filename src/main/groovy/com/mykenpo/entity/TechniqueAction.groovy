package com.mykenpo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
 class TechniqueAction {

    @Id
    @GeneratedValue
    long id

    @Column
    String action

}
