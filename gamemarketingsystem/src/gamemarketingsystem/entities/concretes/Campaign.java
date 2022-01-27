package gamemarketingsystem.entities.concretes;

import java.util.ArrayList;
import java.util.Date;

import gamemarketingsystem.entities.abstracts.CampaignEntity;

public class Campaign implements CampaignEntity{

	private int id;
	private String name;
	private String description;
	private Date startingDate;
	private Date endingDate;
	private double discountRate;
	private ArrayList<Game> games;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String name, String description, Date startingDate, Date endingDate, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
		
}
