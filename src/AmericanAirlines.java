import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;


public class AmericanAirlines extends UnicastRemoteObject implements itfCargaVuelosAmericanAirlines
{
	private ArrayList <clsVuelo>  ListaVuelos= new ArrayList <clsVuelo>();
	
	public ArrayList<clsVuelo> getListaVuelos() {
		return ListaVuelos;
	}

	public void setListaVuelos(ArrayList<clsVuelo> listaVuelos) {
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
				
				clsVuelo  nuevoVuelo;
				codVuelo = "AA0001";
				aeropuertoOrigen = new clsAeropuerto("BARC", "Barcelona", "España");
				aeropuertoDestino = new clsAeropuerto("LON", "Londres", "Inglaterra");
				fecha ="28/05/2019";
				numAsientos = 120;
				precio = 180.90;
				for(int i=0; i<numAsientos; i++)
				{
					Asientos.add(i);
				}
				
				//, String fecha, ArrayList<Integer> Asientos,
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, Asientos, AsientosOcupados, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 2 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("AA0002");
				nuevoVuelo.setFecha("28/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo3:
				nuevoVuelo.setCodVuelo("AA0003");
				nuevoVuelo.setFecha("1/06/2019" );
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				codVuelo = "AAF0004";
				aeropuertoOrigen = new clsAeropuerto("AMS", "Amsterdam", "Holanda");
				aeropuertoDestino = new clsAeropuerto("MAD", "Madrid", "España");
				fecha = "23/06/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, Asientos, AsientosOcupados, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 5 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("AA0005");
				nuevoVuelo.setFecha("20/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo6:
				nuevoVuelo.setCodVuelo("AA0006");
				nuevoVuelo.setFecha("3/05/2019");
				nuevoVuelo.setPrecio(300);
				ListaVuelos.add(nuevoVuelo);
				
				
				codVuelo = "AA0007";
				aeropuertoOrigen = new clsAeropuerto("BIL", "Bilbao", "España");
				aeropuertoDestino = new clsAeropuerto("GLW", "Glasgow", "Escocia");
				
				fecha = "30/05/2019";
				numAsientos = 120;
				precio = 120.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, Asientos, AsientosOcupados, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 8 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("AA0008");
				nuevoVuelo.setFecha("30/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 9:
				nuevoVuelo.setCodVuelo("AA0009");
				nuevoVuelo.setFecha("13/05/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				codVuelo = "AA0010";
				aeropuertoDestino = new clsAeropuerto("DUB", "Dublin", "Irlanda");
				aeropuertoOrigen = new clsAeropuerto("REIK", "Reikiavik", "Islandia");
				fecha = "13/06/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, Asientos, AsientosOcupados, precio);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 11 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("AA0011");
				nuevoVuelo.setFecha("27/06/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 12:
				nuevoVuelo.setCodVuelo("AA0012");
				nuevoVuelo.setFecha("17/06/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
				
				//Vuelo 13 
				codVuelo = "AA0013";
				aeropuertoOrigen = new clsAeropuerto("ROM", "Roma", "Italia");
				aeropuertoDestino = new clsAeropuerto("MOS", "Moscú", "Rusia");
				fecha = "9/05/2019";
				numAsientos = 120;
				precio = 180.90;
				nuevoVuelo = new clsVuelo(codVuelo, aeropuertoOrigen, aeropuertoDestino, fecha, Asientos, AsientosOcupados, precio);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 14 (lo mismo pero en distita fecha con distinto precio:
				nuevoVuelo.setCodVuelo("AA0014");
				nuevoVuelo.setFecha("2/05/2019");
				nuevoVuelo.setPrecio(230.15);
				ListaVuelos.add(nuevoVuelo);
				//Vuelo 15:
				nuevoVuelo.setCodVuelo("AA0015");
				nuevoVuelo.setFecha("13/06/2019");
				nuevoVuelo.setPrecio(79.89);
				ListaVuelos.add(nuevoVuelo);
	}			

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<clsVuelo> cargarIda(String aeroOrigen, String ciudadDestino, String fecha) throws RemoteException
	{
		ArrayList<clsVuelo>  retorno = new ArrayList<clsVuelo>();
		
		for(clsVuelo a : ListaVuelos)
		{
			if( (a.getAeropuertoOrigen().getCiudad()).equals(aeroOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino)  && (a.getFecha()).equals(fecha))
			{
				retorno.add(a);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<clsVuelo> cargarIdaVuelta(String ciudadOrigen, String ciudadDestino, String fechaIda,
			String fechaVuelta) throws RemoteException
	{
		ArrayList<clsVuelo> retorno = new ArrayList<clsVuelo>();
		
		for(clsVuelo a : ListaVuelos)
		{
			//Comprobación de la IDA --> sól comprobamos la vuelta si se cumple la ida
			if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino)  && (a.getFecha())==fechaIda)
			{
				if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadDestino) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadOrigen)  && (a.getFecha())==fechaVuelta)
				{
					retorno.add(a);
				}
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<clsVuelo> cargarCualquierMomento(String ciudadOrigen, String ciudadDestino) throws RemoteException
	{
		ArrayList<clsVuelo> retorno = new ArrayList<clsVuelo>();
		
		for(clsVuelo a : ListaVuelos)
		{
			if( (a.getAeropuertoOrigen().getCiudad()).equals(ciudadOrigen) && (a.getAeropuertoDestino().getCiudad()).equals(ciudadDestino))
			{
				retorno.add(a);
			}
		}
		
		return retorno;
	}

	@Override
	public ArrayList<clsVuelo> cargarTodos()  throws RemoteException
	{
		// TODO Auto-generated method stub
		return ListaVuelos;
	}

}
