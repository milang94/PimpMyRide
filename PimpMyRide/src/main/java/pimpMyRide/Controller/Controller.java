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
import pimpMyRide.model.Car;
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

	@GetMapping("/getAllModels/{brandName}")
	public ResponseEntity<List<String>> allModels(@PathVariable String brandName) {
		return new ResponseEntity<>(carService.findAllModels(brandName), HttpStatus.OK);
	}

	@GetMapping("/getBrand/{brandName}")
	public ResponseEntity<Brand> findBrand(@PathVariable String brandName) {
		return new ResponseEntity<>(brandService.findBrand(brandName), HttpStatus.OK);
	}

	@GetMapping("/getAllBuildYears/{brandName}/{modelName}")
	public ResponseEntity<List<String>> allBuildYears(@PathVariable String brandName, @PathVariable String modelName) {
		return new ResponseEntity<>(carService.findAllBuildYears(brandName, modelName), HttpStatus.OK);
	}

	@GetMapping("/getMotorTypes/{brandName}/{year}/{modelName}")
	public ResponseEntity<List<Object[]>> allMotorTypes(@PathVariable String brandName, @PathVariable String year,
			@PathVariable String modelName) {
		return new ResponseEntity<>(carService.findMotorTypes(brandName, modelName, year), HttpStatus.OK);
	}

	@GetMapping("/getAllInformations/{brandName}/{modelName}/{year}/{motortype}/{fuel}/{opower}")
	public ResponseEntity<Car> allInformations(@PathVariable String brandName, @PathVariable String modelName,
			@PathVariable String year, @PathVariable String motortype, @PathVariable String fuel,
			@PathVariable String opower) {
		return new ResponseEntity<>(carService.findByBrandAndModelAndBuildyearAndMotortypeAndFuelAndOpower(brandName,
				modelName, year, motortype, fuel, opower), HttpStatus.OK);
	}
}
