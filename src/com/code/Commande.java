package com.code;

public class Commande {
	
	//Att
	private String Designation;
	private int QtteCmd;
	private int NumCmd;
	private Date DateCmd;
	private String AdresseCmd;
	
	//Construct
	public Commande(String Destination, int QtteCmd, int NumCmd, Date DateCmd, String AdresseCmd) {
		this.Designation=Destination;this.QtteCmd=QtteCmd;this.NumCmd=NumCmd;this.DateCmd=DateCmd;this.AdresseCmd=AdresseCmd;
	}
	
	//Set methods
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void setQtteCmd(int qtteCmd) {
		QtteCmd = qtteCmd;
	}
	public void setNumCmd(int numCmd) {
		NumCmd = numCmd;
	}
	public void setDateCmd(Date dateCmd) {
		DateCmd = dateCmd;
	}
	public void setAdresseCmd(String adresseCmd) {
		AdresseCmd = adresseCmd;
	}
	
	//Get methods
	public String getDesignation() {
		return Designation;
	}
	public int getQtteCmd() {
		return QtteCmd;
	}
	public int getNumCmd() {
		return NumCmd;
	}
	public Date getDateCmd() {
		return DateCmd;
	}
	public String getAdresseCmd() {
		return AdresseCmd;
	}
	
}

