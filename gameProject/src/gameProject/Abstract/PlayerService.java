package gameProject.Abstract;

import java.rmi.RemoteException;

import gameProject.Entities.Player;

public interface PlayerService {
	void add(Player player) throws NumberFormatException, RemoteException;
	void delete(Player player);
	void update(Player player);
}
