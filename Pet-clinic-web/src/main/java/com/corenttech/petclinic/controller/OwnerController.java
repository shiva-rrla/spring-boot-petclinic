package com.corenttech.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.corenttech.petclinic.service.OwnerService;

@Controller
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService;

	@RequestMapping("/owners")
	public String ownerList(Model  model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owner/index";
	}
	
}
