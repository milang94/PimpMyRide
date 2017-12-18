package pimpMyRide.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pimpMyRide.model.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, String>{

	Model findByName(String modelName);
}
