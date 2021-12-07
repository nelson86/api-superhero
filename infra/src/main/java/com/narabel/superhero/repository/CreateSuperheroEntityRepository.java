package com.narabel.superhero.repository;

import com.narabel.superhero.entity.SuperheroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateSuperheroEntityRepository extends JpaRepository<SuperheroEntity, String> {

}
