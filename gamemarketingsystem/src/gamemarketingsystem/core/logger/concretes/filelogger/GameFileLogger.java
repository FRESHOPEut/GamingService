package gamemarketingsystem.core.logger.concretes.filelogger;

import gamemarketingsystem.core.logger.abstracts.GameLogger;
import gamemarketingsystem.entities.concretes.Game;

public class GameFileLogger implements GameLogger{
	
	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " logged to File");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " log updated on File");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " log deleted from File");
		
	}

}
