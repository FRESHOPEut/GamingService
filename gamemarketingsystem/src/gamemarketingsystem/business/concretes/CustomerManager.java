package gamemarketingsystem.business.concretes;

import gamemarketingsystem.business.abstracts.CustomerService;
import gamemarketingsystem.core.adapters.abstracts.MernisAdapterService;
import gamemarketingsystem.core.logger.abstracts.CustomerLogger;
import gamemarketingsystem.dataAccess.abstracts.CustomerDao;
import gamemarketingsystem.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private CustomerLogger customerLogger;
	private MernisAdapterService mernisAdapterService;
	
	public CustomerManager() {
		super();
	}

	public CustomerManager(CustomerDao customerDao, CustomerLogger customerLogger, MernisAdapterService mernisAdapterService) {
		super();
		this.customerDao = customerDao;
		this.customerLogger = customerLogger;
		this.mernisAdapterService = mernisAdapterService;
	}

	@Override
	public void add(Customer customer) {
		if(this.mernisAdapterService.checkIfRealPerson(customer)) {
			this.customerDao.add(customer);
			this.customerLogger.add(customer);
		}else {
			System.out.println(customer.getNickname() + " is not a valid person");
		}
	}

	@Override
	public void update(Customer customer) {
		if(this.mernisAdapterService.checkIfRealPerson(customer)) {
			this.customerDao.update(customer);
			this.customerLogger.update(customer);
		}else {
			System.out.println(customer.getNickname() + " is not a valid person");
		}
	}

	@Override
	public void delete(Customer customer) {
		this.customerDao.delete(customer);
		this.customerDao.delete(customer);
	}

}
