package main.java.com.xworkz.cm.dao;
import java.util.List;
import main.java.com.xworkz.cm.entity.AppPropEntity;

public interface AppPropDAO {

	public List<AppPropEntity> fetchAllByType(String type);

	public List<AppPropEntity> fetchAllById(String id);

}
