package com.corenttech.petclinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visit extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private LocalDate date;
	private String description;
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
}
