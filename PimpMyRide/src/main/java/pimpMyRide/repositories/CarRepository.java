package pimpMyRide.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pimpMyRide.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	@Query("select distinct model from Car where brand= ?1")
	List<String> findAllModels(String brandName);

	@Query("select distinct buildyear from Car where brand= ?1 and model= ?2")
	List<String> findAllBuildYears(String brandName, String modelName);
	
	@Query("select distinct motortype,fuel from Car where brand= ?1 and model= ?2 and buildyear= ?3")
	List<Object[]> findMotorTypes(String brandName, String modelName, String year);
}
