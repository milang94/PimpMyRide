package pimpMyRide.servicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pimpMyRide.repositories.CarRepository;
import pimpMyRide.services.CarService;

@Service
public class CarServiceImplementation implements CarService {

	@Autowired
	private CarRepository carRep;

	@Override
	public List<String> findAllModels(String brandName) {
		return carRep.findAllModels(brandName);
	}

	@Override
	public List<String> findAllBuildYears(String brandName, String modelName) {
		// TODO Auto-generated method stub
		return carRep.findAllBuildYears(brandName, modelName);
	}

	@Override
	public List<Object[]> findMotorTypes(String brandName, String modelName, String year) {
		// TODO Auto-generated method stub
		return carRep.findMotorTypes(brandName, modelName, year);
	}

}
