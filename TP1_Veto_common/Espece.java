package TP1_Veto_common;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Espece implements Serializable{
	
	//ATTRIBUT
	private String sp;
	private int Age;
	
	
	//constructeur
	public Espece(String sp, int age) throws RemoteException{
		this.Age = age;
		this.sp = sp;
		
	}
	
	
	
	//ACCESSEUR LECTURE ECRITURE
	public String GetSP() {
		return this.sp;
	}
	
	public int GetAge() {
		return this.Age;
	}
	
	

}