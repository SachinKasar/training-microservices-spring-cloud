package demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TransferDetailsController {

	@Autowired 
	DiscoveryClient client;
	
	@GetMapping("/transfer")
	public @ResponseBody String getTransferDetails() {
	  return String.format("%s has transferred %s %s to %s from an account %s.",
		  getValuesFromServices("SESSION-4-PAYEE"),
		  getValuesFromServices("SESSION-4-AMOUNT"),
		  getValuesFromServices("SESSION-4-CURRENCY"),
		  getValuesFromServices("SESSION-4-BENEFICIARY"),
		  getValuesFromServices("SESSION-4-ACCOUNTS") );
	}

	public String getValuesFromServices(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0 ) {
      	URI uri = list.get(0).getUri();
	      	if (uri !=null ) {
	      		return (new RestTemplate()).getForObject(uri,String.class);
	      	}
        }
        return null;
	}

}
