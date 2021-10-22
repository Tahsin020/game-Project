package gameProject.Abstract;

import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public interface GameSaleService {
	void salesGame(Player player,Game game,Campaign campaign);
}
