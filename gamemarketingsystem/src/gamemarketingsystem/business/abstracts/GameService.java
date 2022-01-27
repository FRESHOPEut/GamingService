package gamemarketingsystem.business.abstracts;

import gamemarketingsystem.entities.concretes.Game;

public interface GameService {
	
	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);

}
