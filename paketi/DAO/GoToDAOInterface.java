package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import DTO.Autobus;

public interface GoToDAOInterface {

	public String vracaImePoljaNaOsnovuBrojaStanice(int brojStanice);
	public ArrayList<Autobus>  vracaSatniceAutobusaVeceOdTrenutnogVremena(int brojStanice, int brojOdredista)throws SQLException;
	
	
}
