package pimpMyRide.services;

import java.util.List;

public interface CarService {

	List<String> findAllModels(String brandName);

	List<String> findAllBuildYearss(String brandName, String modelName);

}
