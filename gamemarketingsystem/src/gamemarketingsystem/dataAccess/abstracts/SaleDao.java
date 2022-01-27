package gamemarketingsystem.dataAccess.abstracts;

import gamemarketingsystem.entities.concretes.Campaign;

public interface SaleDao {

	void add(Campaign campaign);
	void delete(Campaign campaign);
}
