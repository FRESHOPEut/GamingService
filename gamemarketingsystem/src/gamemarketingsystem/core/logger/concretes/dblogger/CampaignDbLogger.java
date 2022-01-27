package gamemarketingsystem.core.logger.concretes.dblogger;

import gamemarketingsystem.core.logger.abstracts.CampaignLogger;
import gamemarketingsystem.entities.concretes.Campaign;

public class CampaignDbLogger implements CampaignLogger{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " logged to DataBase");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " log updated on DataBase");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " log deleted from DataBase");
		
	}

}
