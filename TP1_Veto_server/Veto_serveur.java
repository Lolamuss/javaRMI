package TP1_Veto_server;

import java.rmi.registry.Registry;

import TP1_Veto_common.Espece;

//import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

public class Veto_serveur {
	
	//constructeur
	public Veto_serveur () {}
	
	
	//Methode Main qui instancie L'implémentation de l'interface animaux 
	public static void main (String arg[]) {
		
		     try {
		    	 /*System.setProperty( "java.security.policy","security.policy");
				        if (System.getSecurityManager() == null) {
				        System.setSecurityManager(new SecurityManager());
				      } */
		
		    
			
			Registry registry = LocateRegistry.createRegistry(1099);
			Espece Lezard = new Espece("lézard", 8);
			Animaux_Impl AniObj_1 = new Animaux_Impl ("levia", "alise", "pogona");
			Dossier Dossier_1 = new Dossier (AniObj_1);
		
			
	//Methode main qui envoie la reference de notre objet cree au registre rmi 
			
			if (registry == null) {
				System.err.println("Registry not found");
			}
			else
			registry.rebind ("Animal_1", AniObj_1);
		
			System.err.println ("serveur ready");
			
		
			
			
			
		}
		
		catch (Exception e) {
			System.err.println ("serveur exception"+e.toString());
			e.printStackTrace();
		}
	}
}
