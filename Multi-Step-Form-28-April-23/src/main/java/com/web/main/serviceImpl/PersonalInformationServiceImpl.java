package com.web.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.web.main.model.PersonalInformation;
import com.web.main.repository.PersonalInformationRepository;
import com.web.main.service.PersonalInformationService;

@Service
public class PersonalInformationServiceImpl implements PersonalInformationService{

	@Autowired
	PersonalInformationRepository pir;

	@Override
	public PersonalInformation saveDetails(PersonalInformation pinfo) {

		return pir.save(pinfo);
	}

	@Override
	public void deleteDetails(int pid) {
		pir.deleteById(pid);
		
	}
	
	
	
}
