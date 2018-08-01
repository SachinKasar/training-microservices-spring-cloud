package demo.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Manufacturer {

	@Id
	@GeneratedValue
	Long id;
	String name;
	String location;
	 
	
	@OneToMany(cascade=CascadeType.ALL)
	Set<Vehicle> vehicles;
	
	
	public Manufacturer() {
		super();
	}
	public Manufacturer(String location, String name, Set<Vehicle> vehicles) {
		this();
		this.name = name;
		this.location = location;
		this.vehicles = vehicles;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	 
	public Set<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
}
