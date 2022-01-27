package gamemarketingsystem.dataAccess.abstracts;

import gamemarketingsystem.entities.concretes.Customer;

public interface CustomerDao {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
