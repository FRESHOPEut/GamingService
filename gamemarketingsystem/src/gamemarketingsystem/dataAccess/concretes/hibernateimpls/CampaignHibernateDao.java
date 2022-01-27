package gamemarketingsystem.dataAccess.concretes.hibernateimpls;

import gamemarketingsystem.dataAccess.abstracts.CampaignDao;
import gamemarketingsystem.entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " added with Hibernate");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " updated with Hibernate");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " deleted with Hibernate");
		
	}

	
}
