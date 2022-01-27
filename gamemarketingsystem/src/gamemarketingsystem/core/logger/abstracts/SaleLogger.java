package gamemarketingsystem.core.logger.abstracts;

import gamemarketingsystem.entities.concretes.Campaign;

public interface SaleLogger {

	void add(Campaign campaign);
	void delete(Campaign campaign);
}
