package gamemarketingsystem.core.logger.abstracts;

import gamemarketingsystem.entities.concretes.Game;

public interface GameLogger {
	
	void add(Game game);
	void update(Game game);
	void delete(Game game);

}
