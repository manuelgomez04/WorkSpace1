package ejercicio02;

public class Habitacion {

	private int tipo;
	private double precioBase;
	private boolean serviciosExtras;
	private String nombreCliente;
	private int diasContratados;
	private boolean limpio;
	private boolean ocupada;
	private int codigo;	

	public Habitacion(int tipo, double precioBase, boolean serviciosExtras, String nombreCliente, int diasContratados,
			boolean limpio, boolean ocupada, int codigo) {
		
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.serviciosExtras = serviciosExtras;
		this.nombreCliente = nombreCliente;
		this.diasContratados = diasContratados;
		this.limpio = limpio;
		this.ocupada = ocupada;
		this.codigo = codigo;
	}

	


	public int getTipo() {
		return tipo;
	}




	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	public double getPrecioBase() {
		return precioBase;
	}




	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}




	public boolean isServiciosExtras() {
		return serviciosExtras;
	}




	public void setServiciosExtras(boolean serviciosExtras) {
		this.serviciosExtras = serviciosExtras;
	}




	public String getNombreCliente() {
		return nombreCliente;
	}




	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}




	public int getDiasContratados() {
		return diasContratados;
	}




	public void setDiasContratados(int diasContratados) {
		this.diasContratados = diasContratados;
	}




	public boolean isLimpio() {
		return limpio;
	}




	public void setLimpio(boolean limpio) {
		this.limpio = limpio;
	}




	public boolean isOcupada() {
		return ocupada;
	}




	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}




	public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int compareTo (Habitacion h) {
		if (this.tipo == h.getTipo() && this.precioBase == h.getPrecioBase()
				&& this.serviciosExtras == h.isServiciosExtras() &&
				this.nombreCliente.equalsIgnoreCase(h.getNombreCliente()) &&
				this.diasContratados == h.getDiasContratados() && this.limpio == h.isLimpio()
				&& this.ocupada == h.isOcupada() && this.codigo == h.getCodigo()){
			return 0;
		} else {
			return 1;
		}
	}


	public double calcPrecioFinalPDia( double porcentajeSuit, double porcentajeDoble, double porcentajeSuitJUnior) {
		double precioFinalPDia = 0;
		
		
			if (getTipo()==3) {
				precioFinalPDia= getPrecioBase() + (getPrecioBase()*porcentajeSuit/100);
			} if (getTipo()==2){
				precioFinalPDia= getPrecioBase() +getPrecioBase()*porcentajeDoble/100;
			} if (getTipo()==4) {
				precioFinalPDia =getPrecioBase()+ getPrecioBase()*porcentajeSuitJUnior/100;
			} if (getTipo()==1){
				precioFinalPDia = getPrecioBase();
			}
		
		
		return precioFinalPDia;
	}




	@Override
	public String toString() {
		return "Tipo de habitación --> " + tipo + "\nPrecio Base --> " + precioBase + "\nServicios Extras --> " + serviciosExtras
				+ "\nNombre del cliente --> " + nombreCliente + "\nDias contratados --> " + diasContratados + "\nCuarto limpio --> " + limpio
				+ "\nHabitación ocupada --> " + ocupada + "\nCódigo de habitación --> " + codigo;
	}
	

	
}

