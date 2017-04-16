package com.mykenpo.repository;

import com.mykenpo.entity.TechniqueAction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "techniqueaction", path = "techniqueaction")
public interface TechniqueActionRepository extends PagingAndSortingRepository<TechniqueAction, Long> {


}
