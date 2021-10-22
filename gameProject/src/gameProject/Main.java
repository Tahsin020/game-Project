package gameProject;

import java.rmi.RemoteException;

import gameProject.Adapter.MernisServiceAdapter;
import gameProject.Concrete.GameSaleManager;
import gameProject.Concrete.PlayerManager;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public class Main {

	public static void main(String[] args)throws NumberFormatException, RemoteException  {
		Player player = new Player(1, "Tahsin ", "IÞIK", "123456789", 2021, "isik@gmail.com");

		Game game = new Game(1, "Grand Theft Auto V", "Aksiyon - Macera", 100.0);

		Campaign campaign = new Campaign(1, "Yaz Kampanyasý", 20, "20/05/2021");

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);

		System.out.println("**************");

		GameSaleManager gameSaleManager = new GameSaleManager();
		if (playerManager.isCheckPlayer()) {
			gameSaleManager.salesGame(player, game, campaign);
		}

	}

}
