package pimpMyRide.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pimpMyRide.model.Brand;
import pimpMyRide.services.BrandService;
import pimpMyRide.services.CarService;

@RestController
@RequestMapping("/controller")
public class Controller {

	private final BrandService brandService;
	private final CarService carService;

	@Autowired
	public Controller(final BrandService brandService, final CarService carService) {
		this.brandService = brandService;
		this.carService = carService;
	}

	@GetMapping("/getAllBrands")
	public ResponseEntity<List<Brand>> allBrands() {
		return new ResponseEntity<>(brandService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/getAllModels/{brandName}")
	public ResponseEntity<List<String>> allModels(@PathVariable String brandName) {
		return new ResponseEntity<>(carService.findAllModels(brandName), HttpStatus.OK);
	}

	@GetMapping("/getAllBuildYears/{brandName}/{modelName}")
	public ResponseEntity<List<String>> allBuildYears(@PathVariable String brandName, @PathVariable String modelName) {
		return new ResponseEntity<>(carService.findAllBuildYearss(brandName, modelName), HttpStatus.OK);
	}
}
