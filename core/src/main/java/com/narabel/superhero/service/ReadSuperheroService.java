package com.narabel.superhero.service;

import com.narabel.shared.annotation.Service;
import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.domain.SuperheroId;
import com.narabel.superhero.exception.SuperheroException;
import com.narabel.superhero.repository.ReadSuperheroRepository;

import java.util.List;
import java.util.Objects;

@Service
public class ReadSuperheroService {

	private final ReadSuperheroRepository readSuperheroRepository;

	public ReadSuperheroService(ReadSuperheroRepository readSuperheroRepository) {
		this.readSuperheroRepository = readSuperheroRepository;
	}

	public List<Superhero> getAll() {
		return this.readSuperheroRepository.getAll();
	}

	public Superhero readById(SuperheroId id) {
		Superhero superhero = this.readSuperheroRepository.getById(id);

		if( Objects.isNull(superhero) )
			throw new SuperheroException(String.format("No exist SuperHero Id: %s", id.getValue()));

		return superhero;
	}
}
