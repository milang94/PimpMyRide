package pimpMyRide.services;

import java.util.List;

import pimpMyRide.model.Brand;

public interface BrandService {

	List<Brand> findAll();

	Brand findBrand(String brandName);
}
