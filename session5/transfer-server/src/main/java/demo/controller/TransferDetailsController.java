package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.TransferDetailsService;



@Controller
public class TransferDetailsController  {

	@Autowired 
	TransferDetailsService transferDetailsService;
	
	
	 
	@GetMapping("/transfer")
	public @ResponseBody String getTransferDetails() {
		long start = System.currentTimeMillis();
		System.out.println("--- TransferDetailsController.getTransferDetails---");
		String output = 
			"<h3>Some Transactions</h3><br/>" +	  
			transferDetailsService.getTransferDetails() + "<br/><br/>" +
			transferDetailsService.getTransferDetails() + "<br/><br/>" +
			transferDetailsService.getTransferDetails() + "<br/><br/>" +
			transferDetailsService.getTransferDetails() + "<br/><br/>" +
			transferDetailsService.getTransferDetails() + "<br/><br/>"
			;
		long end = System.currentTimeMillis();
		return output + "Elapsed time (ms): " + (end - start);
	}

}
