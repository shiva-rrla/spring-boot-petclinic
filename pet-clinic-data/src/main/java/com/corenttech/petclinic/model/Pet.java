package com.corenttech.petclinic.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Pet extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String name;
	@ManyToOne
	@JoinColumn(name = "type")
	private PetType type;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
	@Singular
	private Set<Visit> visits;
	
	private LocalDate birtyDate;
}
