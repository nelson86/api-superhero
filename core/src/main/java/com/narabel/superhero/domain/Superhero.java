package com.narabel.superhero.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Superhero {
	private SuperheroId id;
	private String name;
	private String power;
}