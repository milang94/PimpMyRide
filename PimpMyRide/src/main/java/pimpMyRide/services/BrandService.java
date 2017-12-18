package pimpMyRide.services;

import pimpMyRide.model.Brand;
import pimpMyRide.model.Model;

public interface BrandService {

	Brand findBrand(String brandName);
	
	Model findModel(String modelName);
}
