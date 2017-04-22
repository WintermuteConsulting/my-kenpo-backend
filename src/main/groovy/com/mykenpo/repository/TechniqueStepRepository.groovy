package com.mykenpo.repository

import com.mykenpo.entity.TechniqueStep
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "techniquestep", path = "techniquestep")
interface TechniqueStepRepository extends CrudRepository<TechniqueStep, Long> {
}
