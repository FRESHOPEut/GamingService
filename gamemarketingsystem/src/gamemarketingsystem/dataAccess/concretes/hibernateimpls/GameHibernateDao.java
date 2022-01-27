package gamemarketingsystem.dataAccess.concretes.hibernateimpls;

import gamemarketingsystem.dataAccess.abstracts.GameDao;
import gamemarketingsystem.entities.concretes.Game;

public class GameHibernateDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " added with Hibernate");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " updated with Hibernate");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " deleted with Hibernate");
		
	}
	
}
