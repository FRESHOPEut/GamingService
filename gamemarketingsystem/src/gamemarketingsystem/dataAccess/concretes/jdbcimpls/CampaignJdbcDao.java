package gamemarketingsystem.dataAccess.concretes.jdbcimpls;

import gamemarketingsystem.dataAccess.abstracts.CampaignDao;
import gamemarketingsystem.entities.concretes.Campaign;

public class CampaignJdbcDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " added with Jdbc");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " updated with Jdbc");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " deleted with Jdbc");
		
	}

}
