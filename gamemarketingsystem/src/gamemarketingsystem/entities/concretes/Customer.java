package gamemarketingsystem.entities.concretes;

import java.util.Date;

import gamemarketingsystem.entities.abstracts.CustomerEntity;

public class Customer implements CustomerEntity{

	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private Date dateOfBirth;
	private String nickname;
	private String email;
	private String password;
	
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String nationalIdentity, Date dateOfBirth, String nickname, 
			String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirth = dateOfBirth;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
