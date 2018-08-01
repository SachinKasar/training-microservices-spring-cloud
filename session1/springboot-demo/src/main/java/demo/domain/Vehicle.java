package demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	Long id;
	String name;
	String type;
	
	
	public Vehicle() {
		super();
	}	
	public Vehicle(String name, String type) {
		this();
		this.type = type;
		this.name = name;
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
	public String getPosition() {
		return type;
	}
	public void setPosition(String type) {
		this.type = type;
	}
	
	
}
