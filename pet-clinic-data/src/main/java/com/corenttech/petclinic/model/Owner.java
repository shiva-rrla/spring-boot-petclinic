package com.corenttech.petclinic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Owner extends Person {
	private static final long serialVersionUID = 1L;
	private String address;
	private String city;
	private String telephone;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
	@Singular
	private Set<Pet> pets;
}
