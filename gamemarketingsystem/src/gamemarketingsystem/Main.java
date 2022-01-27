package gamemarketingsystem;

import java.util.ArrayList;
import java.util.Date;

import gamemarketingsystem.business.concretes.CampaignManager;
import gamemarketingsystem.business.concretes.CustomerManager;
import gamemarketingsystem.business.concretes.GameManager;
import gamemarketingsystem.business.concretes.SaleManager;
import gamemarketingsystem.core.adapters.concretes.MernisAdapterManager;
import gamemarketingsystem.core.logger.concretes.dblogger.CampaignDbLogger;
import gamemarketingsystem.core.logger.concretes.dblogger.CustomerDbLogger;
import gamemarketingsystem.core.logger.concretes.dblogger.GameDbLogger;
import gamemarketingsystem.core.logger.concretes.dblogger.SaleDbLogger;
import gamemarketingsystem.dataAccess.concretes.hibernateimpls.CampaignHibernateDao;
import gamemarketingsystem.dataAccess.concretes.hibernateimpls.CustomerHibernateDao;
import gamemarketingsystem.dataAccess.concretes.hibernateimpls.GameHibernateDao;
import gamemarketingsystem.dataAccess.concretes.hibernateimpls.SaleHibernateDao;
import gamemarketingsystem.entities.concretes.Campaign;
import gamemarketingsystem.entities.concretes.Customer;
import gamemarketingsystem.entities.concretes.Game;
import gamemarketingsystem.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date freshopeDate = new Date(1997,8,8);
		@SuppressWarnings("deprecation")
		Date startingDate = new Date(2022,1,27);
		@SuppressWarnings("deprecation")
		Date finishingDate = new Date(2022,2,1);
		String[] images1 = new String[] {};
		String[] images2 = new String[] {};
		
		System.out.println("USER PART");
		System.out.println("-----------------------------");
		
		
		Customer freshope = new Customer(1,"Umut","Taze","12345678916",freshopeDate,
				"FRESHOPE","freshope@hotmail.com","Something123.");
		CustomerManager customerManager = new CustomerManager(new CustomerHibernateDao(), 
				new CustomerDbLogger(), new MernisAdapterManager());
		customerManager.add(freshope);
		
		System.out.println("");
		System.out.println("GAME PART");
		System.out.println("-----------------------------");

		
		Game game1 = new Game(1,"God of War","Action game","Santa Monica Studios",images1,329);
		Game game2 = new Game(1,"GTA V : Premium Edition","Open-World","RockStar",images2,169);
		GameManager gameManager = new GameManager(new GameHibernateDao(),new GameDbLogger());
		gameManager.add(game1);
		gameManager.add(game2);
		
		ArrayList<Game> games = new ArrayList<Game>();
		games.add(game1);
		games.add(game2);
		
		System.out.println("");
		System.out.println("CAMPAIGN PART");
		System.out.println("-----------------------------");
		
		Campaign campaign1 = new Campaign(1,"Most Sales Bundle","Two games included",startingDate,
				finishingDate,10);
		campaign1.setGames(games);
		CampaignManager campaignManager = new CampaignManager(new CampaignHibernateDao(),new CampaignDbLogger());
		campaignManager.add(campaign1);
		
		System.out.println("");
		System.out.println("SALE PART");
		System.out.println("-----------------------------");
		
		Sale sale = new Sale(1,freshope,campaign1,games);
		
		SaleManager saleManager = new SaleManager(new SaleHibernateDao(),new SaleDbLogger(), campaignManager, campaign1);
		
		saleManager.makeSale(freshope, campaign1);
		saleManager.add(sale);
		
	}

}
