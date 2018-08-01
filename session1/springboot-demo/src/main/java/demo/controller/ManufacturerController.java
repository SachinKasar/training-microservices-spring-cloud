package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Manufacturer;
import demo.repository.ManufacturerRepository;

@RestController
public class ManufacturerController {

	@Autowired ManufacturerRepository manufacturerRepository;
	
	@GetMapping("/manufacturers")
	public Iterable<Manufacturer> getManufacturers() {
		return manufacturerRepository.findAll();
	}
	
	@GetMapping("/manufacturers/{id}")
	public Manufacturer getManufacturer(@PathVariable Long id){
		return manufacturerRepository.findById(id).get();
	}
	
}
