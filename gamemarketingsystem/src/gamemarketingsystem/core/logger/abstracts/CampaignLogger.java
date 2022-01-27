package gamemarketingsystem.core.logger.abstracts;

import gamemarketingsystem.entities.concretes.Campaign;

public interface CampaignLogger {

	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
