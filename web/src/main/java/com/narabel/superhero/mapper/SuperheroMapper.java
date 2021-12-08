package com.narabel.superhero.mapper;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.dto.SuperheroRequestDto;
import com.narabel.superhero.dto.SuperheroResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface SuperheroMapper {

	@Mapping(target = "id", expression = "java(SuperheroId.generar())")
	Superhero toDomain(SuperheroRequestDto superheroRequest);

	@Mapping(source = "id.value", target = "id")
	SuperheroResponseDto toDto(Superhero superhero);

}
