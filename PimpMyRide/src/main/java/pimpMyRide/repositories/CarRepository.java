package pimpMyRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pimpMyRide.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
	
}

