package demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@ActiveProfiles("local-test")	//	"Keep the 'North" profile from loading, keep the external config server from being called.
public class OutOfContainerTest {

	@Autowired WebApplicationContext spring;
	MockMvc mockMvc;
	
	@Before
	public void setup() {
		 
	}
	
	@Test
	public void listRetrieved() throws Exception {

		 
	}

	//	Load test properties to satisfy the first-name placeholder:
	@Configuration
	@Import(Application.class)
	@PropertySource("classpath:/demo/test.properties")
	public static class Config {
	}

}
