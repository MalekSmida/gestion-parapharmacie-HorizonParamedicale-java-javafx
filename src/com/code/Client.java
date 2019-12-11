package com.code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Client {
	
	//Att
	private String NomClt;
	private String AdresseClt;
	private int TelClt;
	private double Credit;
	private double Achat;
	
	public Client() {}
	
	public Client(String NomClt, String AdresseClt, int TelClt, double Credit, double Achat){
		this.NomClt=NomClt;this.AdresseClt=AdresseClt;this.TelClt=TelClt;this.Credit=Credit;this.Achat=Achat;
	}
	
	//Set methods
	public void setNomClt(String nomClt) {
		NomClt = nomClt;
	}
	public void setAdresseClt(String adresseClt) {
		AdresseClt = adresseClt;
	}
	public void setTelClt(int telClt) {
		TelClt = telClt;
	}
	public void setCredit(double credit) {
		Credit = credit;
	}
	public void setAchat(double achat) {
		Achat = achat;
	}
	
	//Get methods
	public String getNomClt() {
		return NomClt;
	}
	public String getAdresseClt() {
		return AdresseClt;
	}
	public int getTelClt() {
		return TelClt;
	}
	public double getCredit() {
		return Credit;
	}
	public double getAchat() {
		return Achat;
	}
	
	//Method ajout
	public void Ajouter(String x1, String x2, int x3, double x4, double x5) {
//		Client c=new Client(x1,x2,x3,x4,x5);
	}
	
	public static void Write(String fileName , Client clt ) throws IOException{
		try {
			FileOutputStream f = new FileOutputStream(fileName,true);
			ObjectOutputStream s= new ObjectOutputStream(f);
			s.writeObject(clt);
			s.close();}
		catch(IOException e) {e.printStackTrace();}
		
	}
	
	public static ArrayList<Client> Read(String fileName) throws Exception {
		ArrayList<Client> listClient=new ArrayList<Client>();
		try {
			FileInputStream input=new FileInputStream("Client");
			Client read=new Client();
			do {
				ObjectInputStream object=new ObjectInputStream(input);
				read=(Client)object.readObject();
				if(input!=null) {
					listClient.add(read);
				}
			}while(input.available()>0);
			input.close();
			return listClient;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
