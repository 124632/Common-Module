package main.java.com.xworkz.cm.service;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.xworkz.cm.dao.LoginDAO;
import main.java.com.xworkz.cm.dto.TempleRegistrationDTO;
import main.java.com.xworkz.cm.entity.PersonalInfoEntity;
import main.java.com.xworkz.cm.entity.VisitingInfoEntity;

@Service
public class RevisitServiceImpl implements RevisitService {
	@Autowired
	private HttpSession httpSession;
	@Autowired
	private LoginDAO dao;
	@Autowired
	private RevisitDAO revisitDAO;
	private static final Logger LOGGER = Logger.getLogger(RevisitServiceImpl.class);

	public RevisitServiceImpl() {
		LOGGER.info("created\t" + this.getClass().getSimpleName());
	}

	@Override
	public String reVisit(TempleRegistrationDTO dto) {
		try {
			LOGGER.info("invoked reVisit method in RevisitServiceImpl class");
			String email = (String) httpSession.getAttribute("email");
			LOGGER.info("Email:" + email);
			if (email != null) {
				PersonalInfoEntity personalInfoEntity = dao.fetchEntityByEmail(email);
				Integer id = personalInfoEntity.getId();
				LOGGER.info("ID: " + id);
				VisitingInfoEntity visitingInfoEntity = new VisitingInfoEntity();
				visitingInfoEntity.setPersonalInfoEntity(personalInfoEntity);
				BeanUtils.copyProperties(dto, visitingInfoEntity);
				revisitDAO.saveVisitinfInfo(visitingInfoEntity, id);
				return "Revisit detals saved success";
			} else {
				LOGGER.info("email id is null");
				return "Revisit detals not saved ";
			}

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}

}
