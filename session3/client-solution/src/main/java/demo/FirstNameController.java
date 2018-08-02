package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstNameController {
	 
	  @Value("${first-name}") 
	  String firstName;
	  
	  @GetMapping("/first-name")
	  public String showFirstName() {
	    return "Your first name is: " + firstName;
	  }
}
