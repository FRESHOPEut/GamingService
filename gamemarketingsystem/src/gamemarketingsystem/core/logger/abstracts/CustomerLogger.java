package gamemarketingsystem.core.logger.abstracts;

import gamemarketingsystem.entities.concretes.Customer;

public interface CustomerLogger {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
