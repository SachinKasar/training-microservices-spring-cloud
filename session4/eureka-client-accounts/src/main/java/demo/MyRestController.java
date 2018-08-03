package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyRestController {

    private final Random random = new Random();
	
	@Value("${accounts}") 
	String accounts;
	
	@GetMapping("/")
	public @ResponseBody String getAccount() {
		String[] accountArray = accounts.split(",");
		int i = (int)Math.round(Math.random() * (accountArray.length - 1));
		return accountArray[i];
	}

}
