package pimpMyRide.services;

import java.util.List;

import pimpMyRide.model.Car;

public interface CarService {

	List<String> findAllModels(String brandName);

	List<String> findAllBuildYears(String brandName, String modelName);

	List<Object[]> findMotorTypes(String brandName, String modelName, String year);
	
	List<Car> findByBrandAndModelAndBuildyearAndMotortypeAndFuelAndOpower(String brand, String model, String year, String motortype, String fuel, String opower);

}
