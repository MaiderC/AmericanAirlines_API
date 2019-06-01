package COMUN;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;

import APIs.itfCargaVuelosAmericanAirlines;


public class AmericanAirlines extends UnicastRemoteObject implements itfCargaVuelosAmericanAirlines
{
	private ArrayList<String>  ListaVuelos= new ArrayList<String>();
	
	public ArrayList<String> getListaVuelos() {
		return ListaVuelos;
	}

	public void setListaVuelos(ArrayList<String> listaVuelos) {
		ListaVuelos = listaVuelos;
	}

	public AmericanAirlines() throws RemoteException 
	{
		super();
		//En el constructor, creamos todos los vuelos:
				String codVuelo;
				clsAeropuerto aeropuertoOrigen;
				clsAeropuerto aeropuertoDestino;
				String fecha;
				int numAsientos;
				double precio;
				ArrayList<Integer> Asientos = new ArrayList <Integer>();
				ArrayList<Integer> AsientosOcupados = new ArrayList <Integer>();
				
				//( BARCELONA - LONDRES )
				ListaVuelos.add("AA0001;Barcelona;Londres;28/05/2019;180.90;120");
				ListaVuelos.add("AA0002;Barcelona;Londres;28/05/2019;230.15;120");
				ListaVuelos.add("AA0003;Barcelona;Londres;01/06/2019;79.89;120");
				
				//( AMSTERDAM - MADRID )
				ListaVuelos.add("AA0004;Amsterdam;Madrid;23/06/2019;180.90;120");
				ListaVuelos.add("AA0005;Amsterdam;Madrid;20/05/2019;230.15;120");
				ListaVuelos.add("AA0006;Amsterdam;Madrid;03/06/2019;300;120");
				
				//( BILBAO - GLASGOW )
				ListaVuelos.add("AA0007;Bilbao;Glasgow;30/05/2019;120.90;120");
				ListaVuelos.add("AA0008;Bilbao;Glasgow;30/06/2019;230.15;120");
				ListaVuelos.add("AA0009;Bilbao;Glasgow;13/05/2019;79.89;120");
				
				//( DUBLIN - REIKIAVIK )
				ListaVuelos.add("AA0010;Dublin;Reikiavik;13/06/2019;180.90;120");
				ListaVuelos.add("AA0011;Dublin;Reikiavik;27/06/2019;230.15;120");
				ListaVuelos.add("AA0012;Dublin;Reikiavik;17/06/2019;79.89;120");
				
				//( ROMA - MOSCU )
				ListaVuelos.add("AA0013;Roma;Moscu;09/06/2019;180.90;120");
				ListaVuelos.add("AA0014;Roma;Moscu;02/06/2019;230.15;120");
				ListaVuelos.add("AA0015;Roma;Moscu;13/06/2019;79.89;120");
	}			

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<String> cargarIda(String ciudadOrigen, String ciudadDestino, String fecha)  throws RemoteException
	{
		ArrayList<String> retorno = new ArrayList<String>();
		String[] vueloToken;
		
		for(String aux: ListaVuelos)
		{
			vueloToken = aux.split(";");
			
			if(vueloToken[1].equals(ciudadOrigen) && vueloToken[2].equals(ciudadDestino) && vueloToken[3].equals(fecha))
			{
				retorno.add(aux);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<String> cargarIdaVuelta(String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaVuelta)  throws RemoteException
	{
		ArrayList<String> retorno = new ArrayList<String>();
		String[] vueloToken;
		
		for(String aux: ListaVuelos)
		{
			vueloToken = aux.split(";");
			
			if(vueloToken[1].equals(ciudadOrigen) && vueloToken[2].equals(ciudadDestino) && vueloToken[3].equals(fechaIda))
			{
				retorno.add(aux);
			}
			
			if(vueloToken[1].equals(ciudadDestino) && vueloToken[2].equals(ciudadOrigen) && vueloToken[3].equals(fechaVuelta))
			{
				retorno.add(aux);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<String> cargarCualquierMomento(String ciudadOrigen, String ciudadDestino) throws RemoteException 
	{
		ArrayList<String> retorno = new ArrayList<String>();
		String[] vueloToken;
		
		for(String aux: ListaVuelos)
		{
			vueloToken = aux.split(";");
			
			if(vueloToken[1].equals(ciudadOrigen) && vueloToken[2].equals(ciudadDestino))
			{
				retorno.add(aux);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<String> cargarTodos()  throws RemoteException
	{
		return ListaVuelos;
	}
}
