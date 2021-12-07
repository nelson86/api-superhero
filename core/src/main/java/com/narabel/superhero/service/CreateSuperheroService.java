package com.narabel.superhero.service;


import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.repository.CreateSuperheroRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class CreateSuperheroService {

	private final CreateSuperheroRepository repository;

	public CreateSuperheroService(CreateSuperheroRepository repository) {
		this.repository = repository;
	}

	public void save(Superhero superhero) {
		log.info("Core: {}", superhero.toString());
		this.repository.save(superhero);
	}

}
