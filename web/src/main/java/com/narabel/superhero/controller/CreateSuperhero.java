package com.narabel.superhero.controller;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.dto.SuperheroRequestDto;
import com.narabel.superhero.mapper.SuperheroMapper;
import com.narabel.superhero.service.CreateSuperheroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Log4j2
@RestController
public class CreateSuperhero {

	@Autowired
	private CreateSuperheroService createSuperheroService;
	@Autowired
	private SuperheroMapper superheroMapper;

	@PostMapping("/v1")
	public ResponseEntity<?> createSuperHero(@Valid @RequestBody SuperheroRequestDto superheroRequest) {
		log.info("Create {}", superheroRequest.toString());
		Superhero superhero = this.superheroMapper.toDomain(superheroRequest);
		this.createSuperheroService.save(superhero);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
