package com.narabel.superhero.controller;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.domain.SuperheroId;
import com.narabel.superhero.dto.SuperheroResponseDto;
import com.narabel.superhero.mapper.SuperheroMapper;
import com.narabel.superhero.service.ReadSuperheroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
public class ReadSuperhero {

	@Autowired
	private ReadSuperheroService readSuperheroService;
	@Autowired
	private SuperheroMapper superheroMapper;

	@GetMapping
	public List<SuperheroResponseDto> readAll() {
		log.info("Read all Superheroes");
		List<Superhero> heroes = this.readSuperheroService.getAll();

		List<SuperheroResponseDto> heroesResponse = heroes.stream()
				.map( this.superheroMapper::toDto )
				.collect(Collectors.toList());

		return heroesResponse;
	}

	@GetMapping("/{id}")
	public SuperheroResponseDto readById(@PathVariable String id) {
		log.info("Read Superhero by Id: {}", id);
		Superhero hero = this.readSuperheroService.readById( new SuperheroId(id) );
		return new SuperheroResponseDto(id, "Superman", "Super fuerza");
	}

}
