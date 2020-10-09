package main.java.com.xworkz.cm.service;

import java.util.List;

import main.java.com.xworkz.cm.dto.AppPropDTO;

public interface AppPropService {

	public List<AppPropDTO> fetchAllByType(String type);

	public List<AppPropDTO> fetchAllById(String id);

}
