package gamemarketingsystem.dataAccess.concretes.jdbcimpls;

import gamemarketingsystem.dataAccess.abstracts.GameDao;
import gamemarketingsystem.entities.concretes.Game;

public class GameJdbcDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " added with Jdbc");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " updated with Jdbc");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " deleted with Jdbc");
		
	}

}
