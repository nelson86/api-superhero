package com.narabel.superhero.adapter;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.repository.CreateSuperheroRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class CreateSuperheroRepositoryImpl implements CreateSuperheroRepository {
	@Override
	public void save(Superhero superhero) {
		log.info("Infra: {}", superhero.toString());
	}
}
