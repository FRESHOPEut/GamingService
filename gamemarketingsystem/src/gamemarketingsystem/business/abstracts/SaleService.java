package gamemarketingsystem.business.abstracts;

import gamemarketingsystem.entities.concretes.Customer;
import gamemarketingsystem.entities.concretes.Sale;
import gamemarketingsystem.entities.concretes.Campaign;

public interface SaleService {
	
	void add(Sale sale);
	void delete(Sale sale);
	void makeSale(Customer customer, Campaign campaign);
}
