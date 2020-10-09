package main.java.com.xworkz.cm.service;

public interface PasswordCryptionService {

	public String encrypt(String strToEncrypt);

	public String decrypt(String strToDecrypt);

}
