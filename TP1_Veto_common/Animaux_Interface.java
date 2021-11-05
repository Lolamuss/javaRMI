package TP1_Veto_common;

import java.rmi.Remote;
import java.rmi.RemoteException;

import TP1_Veto_server.Dossier;

//Interface, signature des methodes
public interface Animaux_Interface extends Remote {
	String Say_Animaux() throws RemoteException;
	void Print_Animaux() throws RemoteException;
	Dossier getDossier() throws RemoteException;
	void setPathos(String path) throws RemoteException;
    String Say_Animal_Dossier() throws RemoteException;

	

}
