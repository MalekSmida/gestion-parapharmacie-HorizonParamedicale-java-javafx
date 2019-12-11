package com.code;

public class Date {
	
	private int Jour;
	private int Mois;
	private int Annee;
	
	public Date(int Jour, int Mois, int Annee) {
		this.Jour=Jour;this.Mois=Mois;this.Annee=Annee;
	}
	
	
	public void setJour(int jour) {
		Jour = jour;
	}
	public void setMois(int mois) {
		Mois = mois;
	}
	public void setAnnee(int annee) {
		Annee = annee;
	}
	
	
	public int getJour() {
		return Jour;
	}
	public int getMois() {
		return Mois;
	}
	public int getAnnee() {
		return Annee;
	}	
	
	public void afficher() {
		System.out.println("hi");
	}
}
