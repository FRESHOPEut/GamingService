package gamemarketingsystem.dataAccess.concretes.jdbcimpls;

import gamemarketingsystem.dataAccess.abstracts.SaleDao;
import gamemarketingsystem.entities.concretes.Campaign;

public class SaleJdbcDao implements SaleDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " sale added with Jdbc");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " sale added with Jdbc");
		
	}
	
	
}
