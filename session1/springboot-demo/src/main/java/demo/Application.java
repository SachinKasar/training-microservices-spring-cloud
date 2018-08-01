package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import demo.domain.Vehicle;
import demo.domain.Manufacturer;
import demo.repository.ManufacturerRepository;

@SpringBootApplication
public class Application {

	@Autowired ManufacturerRepository manufacturerRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @PostConstruct
	public void init() {
		List<Manufacturer> list = new ArrayList<>();

		Set<Vehicle> set = new HashSet<>();
		set.add(new Vehicle("Vehicle", "Two Wheels"));
		set.add(new Vehicle("Splendor++", "Two Wheels"));
		set.add(new Vehicle("Splendor", "Two Wheels"));
		
		list.add(new Manufacturer("Pune", "Honda", set));
		list.add(new Manufacturer("Mumbai","Manufacturer",null));

		manufacturerRepository.saveAll(list);
	}    
    
}
