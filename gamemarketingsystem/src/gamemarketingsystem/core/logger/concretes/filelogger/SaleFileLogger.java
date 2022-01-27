package gamemarketingsystem.core.logger.concretes.filelogger;

import gamemarketingsystem.core.logger.abstracts.SaleLogger;
import gamemarketingsystem.entities.concretes.Campaign;

public class SaleFileLogger implements SaleLogger {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " sale logged to File");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " sale log deleted from File");
		
	}
}
