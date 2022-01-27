package gamemarketingsystem.core.logger.concretes.dblogger;

import gamemarketingsystem.core.logger.abstracts.CustomerLogger;
import gamemarketingsystem.entities.concretes.Customer;

public class CustomerDbLogger implements CustomerLogger{
	
	@Override
	public void add(Customer customer) {
		System.out.println(customer.getNickname() + " logged to DataBase");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getNickname() + " log updated on DataBase");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getNickname() + " log deleted from DataBase");
		
	}

}
