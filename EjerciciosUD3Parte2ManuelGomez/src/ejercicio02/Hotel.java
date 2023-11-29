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
	
	public double calcPrecioFinal(Habitacion h, int tipo, double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior) {
		double precioFinal = 0;
		
		
			if (h.getTipo()==1) {
				precioFinal= h.getTipo() + h.getTipo()*porcentajeSuit;
			} if (h.getTipo()==2){
				precioFinal= h.getTipo() +h.getTipo()*porcentajeDoble;
			} if (h.getTipo()==3) {
				precioFinal =h.getTipo()+ h.getDiasContratados()*porcentajeSuitJUnior;
			} if (h.getTipo()==4){
				precioFinal = h.getTipo();
			}
		
		
		return precioFinal;
	}
	public void mostrarPrecioFinal (Habitacion h, int tipo, double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior) {
		System.out.println("El precio final por noche es de: "+calcPrecioFinal(h, tipo, porcentajeSuit, porcentajeDoble, porcentajeSuitJUnior));
	}

	/*public boolean comprobarOcupada() {
		
		
		
	}*/



}
