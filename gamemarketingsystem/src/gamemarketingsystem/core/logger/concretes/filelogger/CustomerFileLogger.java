package gamemarketingsystem.core.logger.concretes.filelogger;

import gamemarketingsystem.core.logger.abstracts.CustomerLogger;
import gamemarketingsystem.entities.concretes.Customer;

public class CustomerFileLogger implements CustomerLogger{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getNickname() + " logged to File");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getNickname() + " log updated on File");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getNickname() + " log deleted from File");
		
	}
	

}
