package com.mykenpo.repository;


import com.mykenpo.entity.Attack;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "attack", path = "attack")
public interface AttackRepository extends PagingAndSortingRepository<Attack, Long> {

    List<Attack> findByText(@Param("text") String text);
}
