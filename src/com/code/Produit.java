package com.code;

public class Produit {
	
	//Att
	private int Reference;
	private String Designaton;
	private int Qtte;
	private double PUTTC;
	private double PUHT;
	private double TVA;
	private String Fournisseur;
	private int NumFacture;
	private Date DateFacture;
	
	
	//Construct
	public Produit(int Reference, String Designaton,int Qtte, double PUTTC, double PUHT, double TVA, String Fournisseur, int NumFacture,Date DateFacture){
		this.Reference=Reference;this.Designaton=Designaton;this.Qtte=Qtte;this.PUTTC=PUTTC;this.PUHT=PUHT;this.TVA=TVA;this.Fournisseur=Fournisseur;this.NumFacture=NumFacture;this.DateFacture=DateFacture;
	}
	
	//Set methods
	public void setReference(int reference) {
		Reference = reference;
	}
	public void setDesignaton(String designaton) {
		Designaton = designaton;
	}
	public void setQtte(int qtte) {
		Qtte = qtte;
	}
	public void setPUTTC(double pUTTC) {
		PUTTC = pUTTC;
	}
	public void setPUHT(double pUHT) {
		PUHT = pUHT;
	}
	public void setTVA(double tVA) {
		TVA = tVA;
	}
	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
	}
	public void setNumFacture(int numFacture) {
		NumFacture = numFacture;
	}
	public void setDateFacture(Date dateFacture) {
		DateFacture = dateFacture;
	}
	
	//Get methods
	public int getReference() {
		return Reference;
	}
	public String getDesignaton() {
		return Designaton;
	}
	public int getQtte() {
		return Qtte;
	}
	public double getPUTTC() {
		return PUTTC;
	}
	public double getPUHT() {
		return PUHT;
	}
	public double getTVA() {
		return TVA;
	}
	public String getFournisseur() {
		return Fournisseur;
	}
	public int getNumFacture() {
		return NumFacture;
	}
	public Date getDateFacture() {
		return DateFacture;
	}
	
	//Achat TTC
	public double AchatTTC(){
		return PUTTC*Qtte;
	}
	
	//Achat HT
	public double AchatHT(){
		return PUHT*Qtte;
	}

}

