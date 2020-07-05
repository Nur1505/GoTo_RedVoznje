package DTO;

public class Autobus {
	
	private String br_autobusa;
	private String vrijeme;
	
	public Autobus(){}
	
	Autobus(String broj, String vrijeme){
		broj=this.br_autobusa;
		vrijeme=this.vrijeme;
	}
	

	public String getBr_autobusa() {
		return br_autobusa;
	}

	public void setBr_autobusa(String broj) {
		this.br_autobusa = broj;
	}

	public String getVrijeme() {
		return vrijeme;
	}

	public void setVrijeme(String vrijeme) {
		this.vrijeme = vrijeme;
	}
	
	

}
