package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Build a sentence by assembling randomly generated subjects, verbs, 
 * articles, adjectives, and nouns.  The individual parts of speech will 
 * be obtained by calling the various DAOs.
 */
@Service
public class TransferDetailsServiceImpl implements TransferDetailsService {

	@Autowired 
	DataService dataService;
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String getTransferDetails() {
		System.out.println("--- TransferDetailsServiceImpl.getTransferDetails ---");
		return  
			String.format("Payee %s has transferred %s %s to %s from an account %s.",
				dataService.getPayee().getString(),
				dataService.getWord().getString(),
				dataService.getCurrency().getString(), 
				dataService.getBeneficiary().getString(),
				dataService.getAccount().getString()
			);
	}	
	 
}
