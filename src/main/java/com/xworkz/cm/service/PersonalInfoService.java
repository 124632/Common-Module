package main.java.com.xworkz.cm.service;

import main.java.com.xworkz.cm.dto.TempleRegistrationDTO;

public interface PersonalInfoService {
	public String saveAndValidatePersonalInfoEntity(TempleRegistrationDTO dto);

	public String validateAndfetchPersonalInfoEntityByEmail(String email);

}
