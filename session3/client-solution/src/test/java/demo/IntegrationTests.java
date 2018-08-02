package demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local-test")	//	"Keep the 'North" profile from loading, keep the external config server from being called.
public class IntegrationTests {

	 
	
	@Test
	public void contextLoads() {
		 
	}

	//	Load test properties to satisfy the first-name placeholder:
	@Configuration
	@Import(Application.class)
	@PropertySource("classpath:/demo/test.properties")
	public static class Config {
		
	}
}
