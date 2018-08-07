package demo.service;

import demo.domain.Data;

public interface DataService  {

	Data getAccount();
	Data getPayee();
	Data getWord();  // for amount
	Data getBeneficiary();
	Data getCurrency();
	
}
