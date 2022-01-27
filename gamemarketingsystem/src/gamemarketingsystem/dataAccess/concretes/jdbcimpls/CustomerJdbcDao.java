package gamemarketingsystem.dataAccess.concretes.jdbcimpls;

import gamemarketingsystem.dataAccess.abstracts.CustomerDao;
import gamemarketingsystem.entities.concretes.Customer;

public class CustomerJdbcDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getNickname() + " added with Jdbc");
	}

	@Override
	public void update(Customer customer) {
			System.out.println(customer.getNickname() + " updated with Jdbc");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getNickname() + " deleted with Jdbc");
	}

}
