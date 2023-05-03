package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.PersonalInformation;
import com.web.main.service.PersonalInformationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PersonalInformationController {

	@Autowired
	PersonalInformationService pis;
	
	@PostMapping("/postDetails")
	public PersonalInformation addDetails(@RequestBody PersonalInformation pinfo) {
		
		PersonalInformation personalInfo=pis.saveDetails(pinfo);
		
		return personalInfo;		
	}
	
	@DeleteMapping("/delete/{pid}")
	public void deleteDetails(@PathVariable int pid) {
		
		pis.deleteDetails(pid);
	}
	
}
