package gamemarketingsystem.business.concretes;


import gamemarketingsystem.business.abstracts.CampaignService;
import gamemarketingsystem.business.abstracts.SaleService;
import gamemarketingsystem.core.logger.abstracts.SaleLogger;
import gamemarketingsystem.dataAccess.abstracts.SaleDao;
import gamemarketingsystem.entities.concretes.Campaign;
import gamemarketingsystem.entities.concretes.Customer;
import gamemarketingsystem.entities.concretes.Sale;

public class SaleManager implements SaleService{
	
	private SaleDao saleDao;
	private SaleLogger saleLogger;
	private CampaignService campaignService;
	private Campaign campaign;

	public SaleManager() {
		super();
	}

	public SaleManager(SaleDao saleDao, SaleLogger saleLogger, CampaignService campaignService, Campaign campaign) {
		super();
		this.saleDao = saleDao;
		this.saleLogger = saleLogger;
		this.campaignService = campaignService;
		this.campaign = campaign;
	}
	
	@Override
	public void add(Sale sale) {
		this.saleDao.add(this.campaign);
		this.saleLogger.add(this.campaign);
	}

	@Override
	public void delete(Sale sale) {
		this.saleDao.delete(this.campaign);
		this.saleLogger.delete(this.campaign);
	}

	@Override
	public void makeSale(Customer customer, Campaign campaign) {
		System.out.println(customer.getNickname() + " bought " + campaign.getName() + ". Total cost with discount: " +
				this.campaignService.applyCampaign(campaign));
	}


}
