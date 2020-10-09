package main.java.com.xworkz.cm.dao;

import main.java.com.xworkz.cm.entity.PersonalInfoEntity;

public interface LoginDAO {

	public Long checkMailExistingForgeneratePassword(String email);

	public PersonalInfoEntity fetchEntityByEmail(String email);

}
