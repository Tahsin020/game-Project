package gameProject.Concrete;

import gameProject.Abstract.GameSaleService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Game;
import gameProject.Entities.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void salesGame(Player player, Game game, Campaign campaign) {
		double discountedPrice = game.getGamePrice() - (game.getGamePrice()*(campaign.getCampaignDiscount()/100.0));
		System.out.println("Satýn Alýnan Oyun Bilgileri");
		System.out.println("Oyun Adý: " + game.getGameName());
		System.out.println("Oyun Fiyatý (Ýndirimsiz): " + game.getGamePrice());
		System.out.println("Oyun Ýndirimli Fiyati: " + discountedPrice);
		System.out.println("Oyun Türü: " + game.getTypeOfGame());}
}
