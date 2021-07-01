package com.corenttech.petclinic.service;

import com.corenttech.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);
}
