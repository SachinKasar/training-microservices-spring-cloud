package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyRestController {

    private final Random random = new Random();
	
	@Value("${amounts}") 
	String amounts;
	
	@GetMapping("/")
	public @ResponseBody String getWord() {
		String[] amountArray = amounts.split(",");
		int i = (int)Math.round(Math.random() * (amountArray.length - 1));
		return amountArray[i];
	}

}
