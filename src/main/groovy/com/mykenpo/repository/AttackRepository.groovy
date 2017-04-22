package com.mykenpo.repository

import com.mykenpo.entity.Attack
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "attack", path = "attack")
interface AttackRepository extends CrudRepository<Attack, Long> {

    Collection<Attack> findByText(@Param("text") String text)
}
