package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyRestController {

    private final Random random = new Random();
	
	@Value("${payee}") 
	String payee;
	
	@GetMapping("/")
	public @ResponseBody String getPayee() {
		String[] payeeArray = payee.split(",");
		int i = (int)Math.round(Math.random() * (payeeArray.length - 1));
		return payeeArray[i];
	}

}
