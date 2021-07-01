package com.corenttech.petclinic.service.map;

import org.springframework.stereotype.Service;

import com.corenttech.petclinic.model.Vet;
import com.corenttech.petclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

}
