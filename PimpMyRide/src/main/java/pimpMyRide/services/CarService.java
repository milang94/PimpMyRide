package pimpMyRide.services;

import java.util.List;

public interface CarService {

	List<String> findAllModels(String brandName);

	List<String> findAllBuildYears(String brandName, String modelName);

	List<String> findMotorTypes(String brandName, String modelName, String year);

}
