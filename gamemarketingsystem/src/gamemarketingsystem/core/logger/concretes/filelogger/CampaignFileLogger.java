package gamemarketingsystem.core.logger.concretes.filelogger;

import gamemarketingsystem.core.logger.abstracts.CampaignLogger;
import gamemarketingsystem.entities.concretes.Campaign;

public class CampaignFileLogger implements CampaignLogger{
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " logged to File");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " log updated on File");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " log deleted from File");
		
	}

}
