package com.narabel.superhero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperheroResponseDto {
	private String id;
	private String name;
	private String power;
}
