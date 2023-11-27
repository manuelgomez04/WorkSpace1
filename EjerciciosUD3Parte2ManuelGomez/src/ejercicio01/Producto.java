package ejercicio01;

public class Producto {
	private double precioFabrica;
	private String nombre;
	private String codigo;
	private String fechaAlta;
	private int cantidad;
	
	public Producto(double precioFabrica, String nombre, String codigo, String fechaAlta, int cantidad) {
		
		this.precioFabrica = precioFabrica;
		this.nombre = nombre;
		this.codigo = codigo;
		this.fechaAlta = fechaAlta;
		this.cantidad = cantidad;
	}

	public Producto() {
		
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double calcPrecioCosto (double costoTransporte) {
		return precioFabrica - costoTransporte;
	}
	
	
}
