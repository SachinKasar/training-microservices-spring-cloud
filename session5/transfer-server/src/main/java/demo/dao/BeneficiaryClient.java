package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import demo.domain.Data;

@FeignClient("BENEFICIARY")  
public interface BeneficiaryClient {

	@GetMapping("/")
	Data getData();

}
