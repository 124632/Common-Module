package main.java.com.xworkz.cm.dao;

import main.java.com.xworkz.cm.entity.PersonalInfoEntity;

public interface LoginCountDAO {
	
	public void loginCountUpdate(PersonalInfoEntity entity,int count);
	
	public void disableAccountUpdate(PersonalInfoEntity entity,boolean isLock);

}
