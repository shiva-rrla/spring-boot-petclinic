package com.corenttech.petclinic.model;

import java.util.HashSet;
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
public class Owner extends Person {
	private static final long serialVersionUID = 1L;
	private String address;
	private String city;
	private String telephone;
	
	@Builder
	public Owner(String firstName,String lastName,String address,String city,String telephone) {
		super(firstName,lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = new HashSet<>();
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
	@Singular
	private Set<Pet> pets;
}
