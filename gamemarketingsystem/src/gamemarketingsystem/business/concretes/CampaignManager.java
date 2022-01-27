package gamemarketingsystem.business.concretes;

import gamemarketingsystem.business.abstracts.CampaignService;
import gamemarketingsystem.core.logger.abstracts.CampaignLogger;
import gamemarketingsystem.dataAccess.abstracts.CampaignDao;
import gamemarketingsystem.entities.concretes.Campaign;
import gamemarketingsystem.entities.concretes.Game;

public class CampaignManager implements CampaignService{

	private CampaignDao campaignDao;
	private CampaignLogger campaignLogger;
	
	public CampaignManager() {
		super();
	}

	public CampaignManager(CampaignDao campaignDao,CampaignLogger campaignLogger) {
		super();
		this.campaignDao = campaignDao;
		this.campaignLogger = campaignLogger;
	}

	@Override
	public void add(Campaign campaign) {
		this.campaignDao.add(campaign);
		this.campaignLogger.add(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDao.update(campaign);
		this.campaignLogger.update(campaign);
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);
		this.campaignLogger.delete(campaign);
		
	}

	@Override
	public double applyCampaign(Campaign campaign) {
		int totalAmountPrice = 0;
		double discountedAmountPrice = 0;
		for (Game game : campaign.getGames()) {
			totalAmountPrice += game.getPrice();
			
		}
		discountedAmountPrice = totalAmountPrice - (totalAmountPrice * campaign.getDiscountRate() / 100);
		
		return discountedAmountPrice;
	}

}
