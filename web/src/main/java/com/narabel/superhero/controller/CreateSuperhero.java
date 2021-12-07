package com.narabel.superhero.controller;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.domain.SuperheroId;
import com.narabel.superhero.dto.SuperheroRequestDto;
import com.narabel.superhero.service.CreateSuperheroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class CreateSuperhero {

	@Autowired
	private CreateSuperheroService createSuperheroService;

	@PostMapping("/v1")
	public ResponseEntity<?> createSuperHero(@RequestBody SuperheroRequestDto superheroRequest) {
		log.info("Create {}", superheroRequest.toString());
		Superhero superhero = new Superhero(SuperheroId.generar(), "superman", "super fuerza");
		this.createSuperheroService.save(superhero);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
