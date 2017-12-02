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
	public List<String> findAllBuildYearss(String brandName, String modelName) {
		// TODO Auto-generated method stub
		return carRep.findAllBuildYears(brandName, modelName);
	}

}
