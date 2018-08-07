package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import demo.domain.Data;

@FeignClient("PAYEE")
public interface PayeeClient {

	@GetMapping("/")
	Data getData();
	
}
