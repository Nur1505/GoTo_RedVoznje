package BO;

import java.util.ArrayList;

import DTO.Autobus;

public class PogodnaVremena {

	public String ispisPogodnihAutobusaIVremna(ArrayList<Autobus> niz){
	
			String ispis = null;
			
			for(int i = 0; i<niz.size(); i++)
			{
				ispis=niz.get(i).getBr_autobusa()+" "+niz.get(i).getVrijeme()+"\n ";
			}
			
			return ispis;
		
	}
	
}
