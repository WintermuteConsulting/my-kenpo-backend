package com.mykenpo.repository

import com.mykenpo.entity.TechniqueAction
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "techniqueaction", path = "techniqueaction")
interface TechniqueActionRepository extends CrudRepository<TechniqueAction, Long> {


}
