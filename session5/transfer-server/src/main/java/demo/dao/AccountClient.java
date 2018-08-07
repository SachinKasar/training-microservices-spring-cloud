package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import demo.domain.Data;

@FeignClient("ACCOUNT")
public interface AccountClient {

	@GetMapping("/")
	Data getData();
	
}
