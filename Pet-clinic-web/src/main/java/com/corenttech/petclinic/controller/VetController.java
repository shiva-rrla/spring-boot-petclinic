package com.corenttech.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corenttech.petclinic.service.VetService;

@Controller
public class VetController {
	
	@Autowired
	private VetService vetService;
	
	@RequestMapping("/vets")
	public String listVets(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "vets/index";
	}
}
