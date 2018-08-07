package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final Random random = new Random();
	
	@Value("${data}") 
	String[] data;
	
	@GetMapping("/")
	public Data getData() {
		return new Data(data[random.nextInt(data.length)]);
	}
}