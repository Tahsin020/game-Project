package gameProject.Concrete;

import java.rmi.RemoteException;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException {	
		return false;
	}
}
