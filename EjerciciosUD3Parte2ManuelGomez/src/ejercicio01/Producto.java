package ejercicio01;

public class Producto {
	private double precioCosto;
	private String nombre;
	private String codigo;
	private String fechaAlta;
	private int fragil;
	
	public Producto(double precioCosto, String nombre, String codigo, String fechaAlta, int fragil) {
		
		this.precioCosto = precioCosto;
		this.nombre = nombre;
		this.codigo = codigo;
		this.fechaAlta = fechaAlta;
		this.fragil = fragil;
	}

	public Producto() {
		
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(double precioFabrica) {
		this.precioCosto = precioFabrica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getFragil() {
		return fragil;
	}

	public void setFragil(int fragil) {
		this.fragil = fragil;
	}
	
	public double calcPrecio (double porcentaje) {
		
		double precioFabrica;
		
		precioFabrica = precioCosto - (precioCosto*porcentaje/100);
		
		return precioFabrica;
	}
	
	public double calcPVP (double porcentajePVP) {
		double PVP = 0;
		PVP = precioCosto+(precioCosto*porcentajePVP/100);
		return PVP;
	}
	
	
}
