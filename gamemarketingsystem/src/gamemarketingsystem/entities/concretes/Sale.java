package gamemarketingsystem.entities.concretes;

import java.util.ArrayList;

public class Sale {

	private int id;
	private Customer customer;
	private Campaign campaign;
	private ArrayList<Game> games;
	
	public Sale() {
		super();
	}

	public Sale(int id, Customer customer, Campaign campaign, ArrayList<Game> games) {
		super();
		this.id = id;
		this.customer = customer;
		this.campaign = campaign;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public ArrayList<Game> getGames() {
		return games;
	}
	
	
}
