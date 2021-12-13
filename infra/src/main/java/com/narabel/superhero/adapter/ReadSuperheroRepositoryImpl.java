package com.narabel.superhero.adapter;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.domain.SuperheroId;
import com.narabel.superhero.entity.SuperheroEntity;
import com.narabel.superhero.mapper.SuperheroEntityMapper;
import com.narabel.superhero.repository.CreateSuperheroEntityRepository;
import com.narabel.superhero.repository.ReadSuperheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReadSuperheroRepositoryImpl implements ReadSuperheroRepository {

	@Autowired
	private CreateSuperheroEntityRepository entityRepository;

	@Autowired
	private SuperheroEntityMapper superheroEntityMapper;

	@Override
	public List<Superhero> getAll() {
		List<SuperheroEntity> heroesEntity = this.entityRepository.findAll();
		return heroesEntity.stream()
				.map( this.superheroEntityMapper::toDomain )
				.collect(Collectors.toList());
	}

	@Override
	public Superhero getById(SuperheroId id) {
		SuperheroEntity entity = null;
		try {
			entity = this.entityRepository.getById(id.getValue());
		}catch (Exception e) {
			e.printStackTrace();
		}

		return this.superheroEntityMapper.toDomain(entity);
	}
}
