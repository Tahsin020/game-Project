package gameProject.Concrete;

import java.rmi.RemoteException;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Abstract.PlayerService;
import gameProject.Entities.Player;

public class PlayerManager implements PlayerService{
	private PlayerCheckService playerCheckService;
	private boolean checkPlayer = false;

	public PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) throws NumberFormatException, RemoteException {
		if (playerCheckService.checkIfRealPlayer(player)) {
			System.out.println("Oyuncu Kayýt Baþarýlý.");
			System.out.println("Oyuncu Adý: " + player.getFirstName());
			System.out.println("Oyuncu E-Mail: " + player.getEmail());
			System.out.println("Gelen kutusundaki maile bakýnýz ve onaylayýnýz.");
			checkPlayer = true;
		}
		else {
			System.out.println("Lutfen Dogru Bilgilerini Giriniz !");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + " oyuncunun bilgileri silindi.");
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " oyuncunun bilgileri guncellendi.");
	}

	public boolean isCheckPlayer() {
		return checkPlayer;
	}
}
