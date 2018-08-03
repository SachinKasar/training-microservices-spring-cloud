package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyRestController {

    private final Random random = new Random();
	
	@Value("${beneficiaries}") 
	String beneficiaries;
	
	@GetMapping("/")
	public @ResponseBody String getBeneficiary() {
		String[] beneficiariesArray = beneficiaries.split(",");
		int i = (int)Math.round(Math.random() * (beneficiariesArray.length - 1));
		return beneficiariesArray[i];
	}

}
