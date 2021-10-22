package gameProject.Concrete;

import gameProject.Abstract.GameSaleService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void salesGame(Player player, Game game, Campaign campaign) {
		double discountedPrice = game.getGamePrice() - (game.getGamePrice()*(campaign.getCampaignDiscount()/100.0));
		System.out.println("Sat�n Al�nan Oyun Bilgileri");
		System.out.println("Oyun Ad�: " + game.getGameName());
		System.out.println("Oyun Fiyat� (�ndirimsiz): " + game.getGamePrice());
		System.out.println("Oyun �ndirimli Fiyati: " + discountedPrice);
		System.out.println("Oyun T�r�: " + game.getTypeOfGame());}
}
