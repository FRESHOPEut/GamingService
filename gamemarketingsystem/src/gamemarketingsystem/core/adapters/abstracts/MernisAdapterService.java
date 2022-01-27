package gamemarketingsystem.core.adapters.abstracts;

import gamemarketingsystem.entities.concretes.Customer;

public interface MernisAdapterService {

	boolean checkIfRealPerson(Customer customer);
}
