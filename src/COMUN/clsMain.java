package COMUN;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import APIs.itfCargaVuelosAmericanAirlines;

public class clsMain {

	static String IP = "127.0.0.1";
	static String Puerto = "1092";
	static String Service = "AmericanAirlines";
	
	public static void main(String[] args) 
	{
		  if (System.getSecurityManager() == null)
		  {
		   System.setSecurityManager(new SecurityManager());
		  }
		  
		  String name = "//" + IP + ":" + Puerto + "/" +Service;
		  try 
		  {  
		   itfCargaVuelosAmericanAirlines objServer = new AmericanAirlines();
		   Registry registry = LocateRegistry.createRegistry((Integer.valueOf(Puerto)));
		   registry.rebind(name, objServer);
		 //Naming.rebind(name, objServer);
		   System.out.println("* Server '" + name + "' active and waiting...");
		  } 
		  catch (Exception e)
		  {
		   System.err.println("- Exception running the server: " + e.getMessage());
		   e.printStackTrace();
		  }

	}

}
