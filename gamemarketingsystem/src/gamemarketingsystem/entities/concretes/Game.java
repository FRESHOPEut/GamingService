package gamemarketingsystem.entities.concretes;

import gamemarketingsystem.entities.abstracts.GameEntity;

public class Game implements GameEntity{

	private int id;
	private String name;
	private String description;
	private String company;
	private String[] images;
	private double price;
	
	public Game() {
		super();
	}

	public Game(int id, String name, String description, String company, String[] images, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.company = company;
		this.images = images;
		this.price = price;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
