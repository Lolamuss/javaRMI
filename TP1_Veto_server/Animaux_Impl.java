package TP1_Veto_server;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

import TP1_Veto_common.Animaux_Interface;
import TP1_Veto_common.Espece;

public class Animaux_Impl extends UnicastRemoteObject implements Animaux_Interface {
	
 //Attribut
	   private String Nom;
	   private String Maitre;
	   private Espece espece;
	   private String Race;
	   private Dossier dossier;


  //Constructeur
	public Animaux_Impl (String Name, String Master, String Race)throws RemoteException{
		this.Nom = Name;
		this.Maitre = Master;
		this.Race = Race;
		
		
		
	
	} 
	
	public Animaux_Impl()throws RemoteException{
		this.Nom = "Indefini";
		this.Maitre = "Indefini";
		this.Race = "Indefini";
		
		
	}

	public void setDossier (Dossier dos) throws RemoteException {
		this.dossier = dos;
	}
	
	public Dossier getDossier () throws RemoteException {
		return this.dossier;
	}
		
	public void setPathos (String path) throws RemoteException {
		 this.dossier.SetPathologie(path);
		 
	}
	
	//Methode implémenté
	public String Say_Animaux () throws RemoteException {
		return ("Nom de l'animal : "+ this.Nom + ", Nom du maitre : " + this.Maitre + ", race : " + this.Race );
	}
	public void Print_Animaux () throws RemoteException {
		System.out.println (this.Nom + ", animal de "+ this.Maitre);
	}
	public String Say_Animal_Dossier () throws RemoteException {
		return ("Nom de l'animal : "+ this.Nom + ", Dossier :" + this.dossier.GetPathologie());
	}


}

