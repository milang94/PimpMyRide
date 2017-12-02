package pimpMyRide.servicesImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pimpMyRide.model.Brand;
import pimpMyRide.repositories.BrandRepository;
import pimpMyRide.services.BrandService;

@Service
public class BrandServiceImplementation implements BrandService{

	@Autowired
	private BrandRepository brandRep;
	
	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		return brandRep.findAll();
	}

}
