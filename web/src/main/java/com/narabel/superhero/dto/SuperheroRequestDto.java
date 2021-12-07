package com.narabel.superhero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperheroRequestDto {

	@NotEmpty(message = "Debe indicar el nombre del superheroe")
	String name;

	@NotEmpty(message = "Debe indicar el poder del superheroe")
	String power;

}
