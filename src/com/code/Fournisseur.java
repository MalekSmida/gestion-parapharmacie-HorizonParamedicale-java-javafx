package com.code;

public class Fournisseur {
	//Att
	private String NomFr;
	private String AdresseFr;
	private String VilleFr;
	private int CP;
	private int TelFr;
	private int Fax;
	private String Email;
	
	//Construct
	public Fournisseur(String NomFr, String AdresseFr, String VilleFr, int CP, int TelFr, int Fax, String Email){
		this.NomFr=NomFr;this.AdresseFr=AdresseFr;this.VilleFr=VilleFr;this.CP=CP;this.TelFr=TelFr;this.Fax=Fax;this.Email=Email;
	}
	
	//Set methods
	public void setNomFr(String nomFr) {
		NomFr = nomFr;
	}
	public void setAdresseFr(String adresseFr) {
		AdresseFr = adresseFr;
	}
	public void setVilleFr(String villeFr) {
		VilleFr = villeFr;
	}
	public void setCP(int cP) {
		CP = cP;
	}
	public void setTelFr(int telFr) {
		TelFr = telFr;
	}
	public void setFax(int fax) {
		this.Fax = fax;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	//Get methods
	public String getNomFr() {
		return NomFr;
	}
	public String getAdresseFr() {
		return AdresseFr;
	}
	public String getVilleFr() {
		return VilleFr;
	}
	public int getCP() {
		return CP;
	}
	public int getTelFr() {
		return TelFr;
	}
	public int getFax() {
		return Fax;
	}
	public String getEmail() {
		return Email;
	}
}


