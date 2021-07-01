package com.corenttech.petclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.corenttech.petclinic.model.Owner;
import com.corenttech.petclinic.model.Vet;
import com.corenttech.petclinic.service.OwnerService;
import com.corenttech.petclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	@Autowired
	private OwnerService ownerService;
	
	@Autowired
	private VetService vetService;
	
	@Override
	public void run(String... args) throws Exception {
		Owner owner = Owner.builder().firstName("shiva").lastName("Ravi").address("Address").city("CIty").telephone("999999999").build();
		Owner owner2 = Owner.builder().firstName("shiva").lastName("Ravi").address("Address").city("CIty").telephone("999999999").build();
		Vet vet = Vet.builder().firstName("FirstVet").lastName("LastVet").build();
		Vet vet2 = Vet.builder().firstName("FirstVet").lastName("LastVet").build();
		ownerService.save(owner);
		ownerService.save(owner2);
		vetService.save(vet);
		vetService.save(vet2);
		
	}

}
