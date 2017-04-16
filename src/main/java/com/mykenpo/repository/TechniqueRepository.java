package com.mykenpo.repository;

import com.mykenpo.entity.Technique;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "technique", path = "technique")
public interface TechniqueRepository extends PagingAndSortingRepository<Technique, Long> {
    Technique findByName(@Param("name") String name);
    Technique findById(@Param("id") long id);
}


