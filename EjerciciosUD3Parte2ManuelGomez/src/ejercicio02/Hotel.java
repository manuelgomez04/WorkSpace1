package ejercicio02;



public class Hotel {

	private Habitacion lista [];
	private int numHab;
	
	
	
	public Hotel(Habitacion[] lista, int numHab) {
		this.lista = lista;
		this.numHab = numHab;
	}
	

	public void agregar (Habitacion h) {
		lista [numHab] = h;
		numHab++;
	}
	
	public void mostrarPrecioFinal ( double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior) {
		for (int i = 0; i < numHab; i++) {
		System.out.println("El precio final por noche es de: "
				+ ""+lista[i].calcPrecioFinalPDia(porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior));
		}
	}
	
	public void mostrarOcupada (boolean ocupada, int codigo) {
		int index = findByIdV2(codigo);
		
		
		
		if(lista[index].isOcupada()) {
			System.out.println("Está ocupada");
			
		} else {
			System.out.println("Está libre");
		}
	}
	
	public void mostrarTodasOcupadas () {
		
		for (int i = 0; i < numHab; i++) {
			if (lista[i].isOcupada()){
				System.out.println(lista[i]);
			}
		}
		
		
	}
	public int buscarHab ( Habitacion h) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			if (h.compareTo(lista[i]) == 0) {
				encontrado = true;
			} else {
				i++;
			}
		} 
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
		
		
		
	}
	
	public int findByIdV2(int codigo) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			
			if (lista[i].getCodigo() == codigo)
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}

	public void mostrarBuscado (int codigo, double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior) {
		int index = findByIdV2(codigo);
		
		System.out.println(lista [index].getCodigo()+"\n "+lista[index].getDiasContratados()+"\n "+lista [index].isLimpio()+"\n "+
		lista[index].isOcupada()+"\n "+lista[index].isServiciosExtras()+"\n m"+lista[index].getNombreCliente()+"\n " 
				+ lista[index].calcPrecioFinalPDia(porcentajeDoble,porcentajeSuit, porcentajeSuitJUnior));
	}
	
	public double calcPrecioFinalTotal(int codigo, boolean extra, double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior,
			double porcentajeExtra, int diasContratados ) {
		int index = findByIdV2(codigo);
		double precioFinalTotal = 0;
		if (extra) {
		precioFinalTotal = (lista[index].calcPrecioFinalPDia(porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior) +
				(lista[index].calcPrecioFinalPDia(porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior) * 
						porcentajeExtra/100))* diasContratados ;
		} else {
			precioFinalTotal = lista[index].calcPrecioFinalPDia(porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior)*diasContratados;
		}
		return precioFinalTotal;
	}
	
	public void mostrarPrecioFinalTotal (int codigo, boolean extra, double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior,
			double porcentajeExtra, int diasContratados) {
			System.out.println("El precio de la habitación será "+
		calcPrecioFinalTotal(codigo, extra, porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior, porcentajeExtra, diasContratados));
		
	}
	
	public void mostrarFactura (int codigo, boolean extra, double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior,
			double porcentajeExtra, int diasContratados) {
		int index = findByIdV2(codigo);
		System.out.println(lista[index].toString());
		mostrarPrecioFinalTotal(codigo, extra, porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior, porcentajeExtra, diasContratados);
	}
}
