package com.web.main.service;

import com.web.main.model.PersonalInformation;

public interface PersonalInformationService {

	public PersonalInformation saveDetails(PersonalInformation pinfo);

	public void deleteDetails(int pid);

}
