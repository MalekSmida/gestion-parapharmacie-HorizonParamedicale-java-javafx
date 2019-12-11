package com.code;

public class FichDeStock {
	
	//Att
	private int Reference;
	private int QtteStock;
	
	//Construct
	public FichDeStock(int Reference, int QtteStock) {
		this.Reference=Reference;this.QtteStock=QtteStock;
	}
	
	//Set methods
	public void setReference(int reference) {
		Reference = reference;
	}
	public void setQtteStock(int qtteStock) {
		QtteStock = qtteStock;
	}
	
	//Get methods
	public int getReference() {
		return Reference;
	}
	public int getQtteStock() {
		return QtteStock;
	}
	
	//Ajout au stock
	public void AjouterStock(int x) {
		QtteStock+=x;
	}
	
	//supprimer du stock
	public void SupprimerStock(int x) {
		if(QtteStock>=x)
			QtteStock-=x;
		else
			System.out.println("stock insuffisant!");
	}
	
	//alert si stock finit pour commander

}
