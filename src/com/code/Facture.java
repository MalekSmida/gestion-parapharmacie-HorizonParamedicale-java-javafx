package com.code;

public class Facture {
	
	//Att
	private int Reference;
	private String Designation;
	private int QtteFact;
	private double PUTTC;
	private int Remise;
	private int NumFacture;
	private String NomClient;
	
	
	//Construct
	public Facture(int Reference, String Designation, int QtteFact, double PUTTC, int Remise, int NumFacture, String NomClient){
		this.Reference=Reference;this.Designation=Designation;this.QtteFact=QtteFact;this.PUTTC=PUTTC;this.Remise=Remise;this.NumFacture=NumFacture;this.NomClient=NomClient;
	}
	
	//Set methods
	public void setReference(int reference) {
		Reference = reference;
	}
	public void setDesignaton(String designation) {
		Designation = designation;
	}
	public void setQtteFact(int qtteFact) {
		QtteFact = qtteFact;
	}
	public void setPUTTC(double pUTTC) {
		PUTTC = pUTTC;
	}
	public void setRemise(int remise) {
		Remise = remise;
	}
	public void setNumFacture(int numFacture) {
		NumFacture = numFacture;
	}
	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}
	
	
	//Get methods
	public int getReference() {
		return Reference;
	}
	public String getDesignaton() {
		return Designation;
	}
	public int getQtteFact() {
		return QtteFact;
	}
	public double getPUTTC() {
		return PUTTC;
	}
	public int getRemise() {
		return Remise;
	}
	public int getNumFacture() {
		return NumFacture;
	}
	public String getNomClient() {
		return NomClient;
	}
	
	
	//PUTTC-R
	public double PUTTC_R(){
		return PUTTC-((PUTTC/100)*Remise);
	}
	
	//Total
	public double Total() {
		return this.PUTTC_R()*QtteFact;
	}
	

}
