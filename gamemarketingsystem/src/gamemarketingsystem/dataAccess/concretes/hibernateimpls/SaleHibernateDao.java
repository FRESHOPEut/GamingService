package gamemarketingsystem.dataAccess.concretes.hibernateimpls;

import gamemarketingsystem.dataAccess.abstracts.SaleDao;
import gamemarketingsystem.entities.concretes.Campaign;

public class SaleHibernateDao implements SaleDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " sale added with Hibernate");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " sale deleted with Hibernate");
		
	}

	
}
