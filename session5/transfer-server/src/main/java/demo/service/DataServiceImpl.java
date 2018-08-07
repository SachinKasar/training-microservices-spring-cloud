package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


import demo.dao.AccountClient;
import demo.dao.AmountClient;
import demo.dao.BeneficiaryClient;
import demo.dao.CurrencyClient;
import demo.dao.PayeeClient;
import demo.domain.Data;

@Service
public class DataServiceImpl implements DataService {

	@Autowired 
	PayeeClient payeeClient;
	
	@Autowired 
	AccountClient accountClient;
	
	@Autowired 
	AmountClient amountClient;
	
	@Autowired 
	BeneficiaryClient beneficiaryClient;
	
	@Autowired 
	CurrencyClient currencyClient;
	
	
	
	@Override
	public Data getAccount() {
		return accountClient.getData();
	}
	
	@Override
	public Data getPayee() {
		return payeeClient.getData();
	}
	
	@Override
	public Data getWord() {
		return amountClient.getData();
	}
	
	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public Data getBeneficiary() {
		return beneficiaryClient.getData();
	}
	
	public Data reliable() {
     return new Data("Reliable Beneficiary");
	}
	
	@Override
	public Data getCurrency() {
		return currencyClient.getData();
	}	
}
