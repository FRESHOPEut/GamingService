package gamemarketingsystem.business.concretes;

import gamemarketingsystem.business.abstracts.GameService;
import gamemarketingsystem.core.logger.abstracts.GameLogger;
import gamemarketingsystem.dataAccess.abstracts.GameDao;
import gamemarketingsystem.entities.concretes.Game;

public class GameManager implements GameService{
	
	private GameDao gameDao;
	private GameLogger gameLogger;

	public GameManager() {
		super();
	}

	public GameManager(GameDao gameDao,GameLogger gameLogger) {
		super();
		this.gameDao = gameDao;
		this.gameLogger = gameLogger;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		this.gameLogger.add(game);
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		this.gameLogger.update(game);
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		this.gameLogger.delete(game);
	}

}
