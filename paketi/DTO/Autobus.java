package DTO;

public class Autobus {
	
	private String br_autobusa;
	private String vrijemeNaTrenutnoj;
	private String vrijemeNaOdredistu;
	public Autobus(){}
	
	Autobus(String broj, String vrijemeTr, String vrijemeOdr){
		broj=this.br_autobusa;
		vrijemeTr=this.vrijemeNaTrenutnoj;
		vrijemeOdr=this.vrijemeNaOdredistu;
	}
	

	public String getBr_autobusa() {
		return br_autobusa;
	}

	public void setBr_autobusa(String broj) {
		this.br_autobusa = broj;
	}

	public String getVrijemeNaTrenutnoj() {
		return vrijemeNaTrenutnoj;
	}

	public void setVrijemeNaTrenutnoj(String vrijemeNaTrenutnoj) {
		this.vrijemeNaTrenutnoj = vrijemeNaTrenutnoj;
	}

	public String getVrijemeNaOdredistu() {
		return vrijemeNaOdredistu;
	}

	public void setVrijemeNaOdredistu(String vrijemeNaOdredistu) {
		this.vrijemeNaOdredistu = vrijemeNaOdredistu;
	}

	
	

}
