package TP1_Veto_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Dossier extends UnicastRemoteObject{
	
	//ATTRIBUT
	private String Pathologie;
	private Animaux_Impl Animal;
	
	//constructeur
	public Dossier(Animaux_Impl animal) throws RemoteException{
		this.Animal = animal;
		animal.setDossier(this);
		this.Pathologie = "pas de pathologie en cours";
	}
	
	public Dossier(Animaux_Impl animal, String Path) throws RemoteException {
		this.Animal = animal;
		animal.setDossier(this);
		this.Pathologie = Path;
	}
	
	//ACCESSEUR LECTURE ECRITURE
	public String GetPathologie() {
		return this.Pathologie;
	}
	public void SetPathologie(String Path) {
		this.Pathologie=Path;
	}
	
	public Animaux_Impl GetAnimal() {
		return this.Animal;
	}

}