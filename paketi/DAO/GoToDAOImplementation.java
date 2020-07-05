package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.Autobus;


public class GoToDAOImplementation implements GoToDAOInterface   {

	Connection connection; 
	ConnectionManager cm= new ConnectionManager();
	
	@Override
	public String vracaImePoljaNaOsnovuBrojaStanice(int brojStanice) {
		String imePolja="";
		int i=1;
		while(i<=10)
		 {	
		if(brojStanice==i) {
			imePolja="vrijeme_stanici_"+i;
			break;
		}
		i++;
		}
		
		
		return imePolja;
		
	}

	@Override
	public ArrayList<Autobus> vracaSatniceAutobusaVeceOdTrenutnogVremena(int brojStanice) throws SQLException{
		ArrayList<Autobus> autobusi= new ArrayList<Autobus>();
		String query;
		String imePoljaStanice= vracaImePoljaNaOsnovuBrojaStanice( brojStanice);
		query="SELECT BR_AUTOBUSA,"+imePoljaStanice+" FROM vrijeme_na_stanicama WHERE STR_TO_DATE("+imePoljaStanice+", ' %H:%i:%s') > now()";
		 
		ResultSet rs = null;

		try {
			try {
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
				} catch (InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				connection= cm.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PreparedStatement statement = connection.prepareStatement(query);
			
			rs = statement.executeQuery();

			
			while(rs.next()) {
				Autobus autobus=new Autobus();
				autobus.setBr_autobusa(rs.getString("BR_AUTOBUSA"));
				autobus.setVrijeme(rs.getString(imePoljaStanice));
				autobusi.add(autobus);
			}
				
				rs.close();
			}finally{}
			
		
		return autobusi;
	}

	

}
