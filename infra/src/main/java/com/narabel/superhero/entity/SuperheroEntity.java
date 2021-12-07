package com.narabel.superhero.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
@Table(name = "superheroes")
public class SuperheroEntity {

	@Id
	@Column(length = 36)
	private String id;

	private String name;
	private String power;

}
