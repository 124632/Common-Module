package main.java.com.xworkz.cm.service;

import main.java.com.xworkz.cm.entity.PersonalInfoEntity;

public interface LoginCountService {

	public String loginCount(PersonalInfoEntity personalInfoEntity,int count);
	
	public String disableLogin(PersonalInfoEntity personalInfoEntity,boolean isLock);

}
