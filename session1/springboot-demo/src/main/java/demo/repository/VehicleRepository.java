package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import demo.domain.Vehicle;

@RestResource(path="vehicles", rel="vehicle")
public interface VehicleRepository extends CrudRepository<Vehicle,Long>{

}
