package pimpMyRide.servicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pimpMyRide.model.Brand;
import pimpMyRide.model.Model;
import pimpMyRide.repositories.BrandRepository;
import pimpMyRide.repositories.ModelRepository;
import pimpMyRide.services.BrandService;

@Service
public class BrandServiceImplementation implements BrandService {

	@Autowired
	private BrandRepository brandRep;
	
	@Autowired
	private ModelRepository modelRep;

	@Override
	public Brand findBrand(String brandName) {
		// TODO Auto-generated method stub
		return brandRep.findByName(brandName);
	}
	
	@Override
	public Model findModel(String modelName) {
		// TODO Auto-generated method stub
		return modelRep.findByName(modelName);
	}

}
