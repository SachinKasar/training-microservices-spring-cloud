package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MyRestController {

    private final Random random = new Random();
	
	@Value("${currencies}") 
	String currencies;
	
	@GetMapping("/")
	public @ResponseBody String getCurrency() {
    String[] currenciesArray = currencies.split(",");
    int i = (int)Math.round(Math.random() * (currenciesArray.length - 1));
    return currenciesArray[i];
  }

}
