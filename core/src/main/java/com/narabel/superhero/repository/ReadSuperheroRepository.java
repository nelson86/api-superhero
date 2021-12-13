package com.narabel.superhero.repository;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.domain.SuperheroId;

import java.util.List;

public interface ReadSuperheroRepository {

	List<Superhero> getAll();
	Superhero getById(SuperheroId id);

}
