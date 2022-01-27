package gamemarketingsystem.dataAccess.concretes.hibernateimpls;

import gamemarketingsystem.dataAccess.abstracts.CustomerDao;
import gamemarketingsystem.entities.concretes.Customer;

public class CustomerHibernateDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
			System.out.println(customer.getNickname() + " added with Hibernate");
	}

	@Override
	public void update(Customer customer) {
			System.out.println(customer.getNickname() + " updated with Hibernate");
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getNickname() + " deleted with Hibernate");
	}

}
