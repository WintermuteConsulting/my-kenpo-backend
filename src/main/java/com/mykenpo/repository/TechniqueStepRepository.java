package com.mykenpo.repository;

import com.mykenpo.entity.TechniqueStep;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "techniquestep", path = "techniquestep")
public interface TechniqueStepRepository extends PagingAndSortingRepository<TechniqueStep, Long> {
}
