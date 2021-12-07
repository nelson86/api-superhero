package com.narabel.superhero.adapter;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.entity.SuperheroEntity;
import com.narabel.superhero.mapper.SuperheroEntityMapper;
import com.narabel.superhero.repository.CreateSuperheroEntityRepository;
import com.narabel.superhero.repository.CreateSuperheroRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class CreateSuperheroRepositoryImpl implements CreateSuperheroRepository {

	@Autowired
	private CreateSuperheroEntityRepository entityRepository;

	@Autowired
	private SuperheroEntityMapper superheroEntityMapper;

	@Override
	public void save(Superhero superhero) {
		SuperheroEntity entity = this.superheroEntityMapper.toEntity(superhero);
		this.entityRepository.save(entity);
		log.info("Infra: {}", superhero.toString());
	}
}
