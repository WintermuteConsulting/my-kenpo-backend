package com.mykenpo.repository

import com.mykenpo.entity.Movement
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "movement", path = "movement")
interface MovementRepository extends CrudRepository<Movement, Long> {
}
