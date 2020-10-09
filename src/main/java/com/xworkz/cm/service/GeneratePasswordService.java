package main.java.com.xworkz.cm.service;

public interface GeneratePasswordService {

	public String generatePassword();

	public String sendGeneratedPassword(String email);

	public String reSendGeneratedPassword(String email);

}
