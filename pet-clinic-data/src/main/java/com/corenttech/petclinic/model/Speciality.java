package com.corenttech.petclinic.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Speciality extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String description;
}
