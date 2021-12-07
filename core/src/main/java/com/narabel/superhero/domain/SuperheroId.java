package com.narabel.superhero.domain;

import lombok.Value;

import java.util.UUID;

@Value
public class SuperheroId {

	String value;

	public SuperheroId(String value) {
		this.value = value;
	}

	public static SuperheroId generar() {
		return new SuperheroId(UUID.randomUUID().toString());
	}

}
