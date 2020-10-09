package main.java.com.xworkz.cm.dao;

import main.java.com.xworkz.cm.entity.PersonalInfoEntity;

public interface PersonalInfoDAO {

	public void savePersonalInfoEntity(PersonalInfoEntity entity);

	public Long fetchCountByEmail(String email);

	public Long fetchCountByMobileNo(Long mobileNo);

	public PersonalInfoEntity fetchPersonalInfoEntityByEmail(String email);

}