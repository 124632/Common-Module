package main.java.com.xworkz.cm.service;

import main.java.com.xworkz.cm.dto.TempleRegistrationDTO;

public interface MailService {

	public void sendMail(TempleRegistrationDTO dto);

	public void sendPasswordByMail(String email);

	public void reSendPasswordByMail(String email);

}
