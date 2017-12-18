package pimpMyRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pimpMyRide.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, String> {

	Brand findByName(String brandName);
}
