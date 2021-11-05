package TP1_Veto_Client;

//import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import TP1_Veto_common.Animaux_Interface;


public class client {
	private client() {};
	
	public static void main (String[] args) {

	

		try {
			/*System.setProperty( "java.security.policy","security.policy");
		        if (System.getSecurityManager() == null) {
		        System.setSecurityManager(new SecurityManager());
		      } */
			

			Registry registry = LocateRegistry.getRegistry(1099);
			Animaux_Interface Stub_1 = (Animaux_Interface) registry.lookup("Animal_1");
		    
		    String Response = Stub_1.Say_Animaux();
		    System.out.println(Response);
		    
		    Stub_1.Print_Animaux();
		    
		    Stub_1.setPathos("grippe");
		
		    String Response2 = Stub_1.Say_Animal_Dossier();
		    System.out.println(Response2);
			
		}
		
		
		
		catch (Exception e) {
			System.err.println ("serveur exception"+e.toString());
			e.printStackTrace();
		}
	}
}