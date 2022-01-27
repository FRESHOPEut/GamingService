package gamemarketingsystem.core.logger.concretes.dblogger;

import gamemarketingsystem.core.logger.abstracts.GameLogger;
import gamemarketingsystem.entities.concretes.Game;

public class GameDbLogger implements GameLogger{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " logged to DataBase");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " log updated on DataBase");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " log deleted from DataBase");
		
	}

	
}
