package gamemarketingsystem.core.logger.concretes.dblogger;

import gamemarketingsystem.core.logger.abstracts.SaleLogger;
import gamemarketingsystem.entities.concretes.Campaign;


public class SaleDbLogger implements SaleLogger{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " sale logged to DataBase");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " sale log deleted from DataBase");
		
	}

}
