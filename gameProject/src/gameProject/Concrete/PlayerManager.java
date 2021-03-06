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
			System.out.println("Oyuncu Kay?t Ba?ar?l?.");
			System.out.println("Oyuncu Ad?: " + player.getFirstName());
			System.out.println("Oyuncu E-Mail: " + player.getEmail());
			System.out.println("Gelen kutusundaki maile bak?n?z ve onaylay?n?z.");
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
