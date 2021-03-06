package main.java.com.xworkz.cm.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import main.java.com.xworkz.cm.service.LoginService;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")

public class LoginController {
	@Autowired
	LoginService loginService;
	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	public LoginController() {
		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String doLogin(@RequestParam String email, @RequestParam String password, Model model,
			HttpSession httpSession) {
		try {
			httpSession.setAttribute("email", email);
			LOGGER.info("invoked doLogin LoginController");
			String loginMessage = loginService.login(email, password);

			model.addAttribute("message", loginMessage);

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		return "LoginSuccess";

	}

}