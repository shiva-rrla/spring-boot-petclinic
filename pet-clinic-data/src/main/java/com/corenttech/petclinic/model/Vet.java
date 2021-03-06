package com.corenttech.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
public class Vet extends Person {  
	
	private static final long serialVersionUID = 1L;
	
	@Builder
	public Vet(String firstName,String lastName) {
		super(firstName, lastName);
		this.specialities = new HashSet<>();
	}
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vet_specialities",joinColumns = @JoinColumn(name = "vet_id"),inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	@Singular
	private Set<Speciality> specialities;
	
}
