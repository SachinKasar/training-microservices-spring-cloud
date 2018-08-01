package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import demo.domain.Manufacturer;

@RestResource(path="manufacturers", rel="manufacturer")
public interface ManufacturerRepository extends CrudRepository<Manufacturer,Long>{

}
