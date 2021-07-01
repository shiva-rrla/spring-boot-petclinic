package com.corenttech.petclinic.service.map;

import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.corenttech.petclinic.model.Owner;
import com.corenttech.petclinic.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{
	public Owner findByLastName(String lastName) {
		Optional<Entry<Long, Owner>> findFirst = data.entrySet().stream()
				.filter(value -> lastName.equals(value.getValue().getLastName())).findFirst();
		return findFirst.get().getValue();
	}
}
