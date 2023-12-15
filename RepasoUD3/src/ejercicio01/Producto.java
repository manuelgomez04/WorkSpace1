package ejercicio01;

public class Producto {

	private String nombre;
	private double pFabrica;
	private int seccion;
	private boolean enVenta;
	private int id;
	
	public Producto(String nombre, double pFabrica, int seccion, boolean enVenta, int id) {
		this.nombre = nombre;
		this.pFabrica = pFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getpFabrica() {
		return pFabrica;
	}

	public void setpFabrica(double pFabrica) {
		this.pFabrica = pFabrica;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", pFabrica=" + pFabrica + ", seccion=" + seccion + ", enVenta=" + enVenta
				+ ", id=" + id + "]";
	}
	
	
	
	
	
	
}
