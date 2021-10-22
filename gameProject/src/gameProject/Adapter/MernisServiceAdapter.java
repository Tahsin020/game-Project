package gameProject.Adapter;

import java.rmi.RemoteException;

import gameProject.Abstract.PlayerCheckService;
import gameProject.Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPlayer(Player player) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getBirthYear());
	}

}
