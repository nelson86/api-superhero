package com.narabel.superhero.mapper;

import com.narabel.superhero.domain.Superhero;
import com.narabel.superhero.entity.SuperheroEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SuperheroEntityMapper {

	@Mapping(source = "id.value", target = "id")
	SuperheroEntity toEntity(Superhero superhero);

	@InheritInverseConfiguration
	Superhero toDomain(SuperheroEntity superheroEntity);

}
