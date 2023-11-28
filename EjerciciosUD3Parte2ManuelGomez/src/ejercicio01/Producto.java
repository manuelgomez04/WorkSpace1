package ejercicio01;

public class Producto {
	private double precioFabrica;
	private String nombre;
	private String codigo;
	private String fechaAlta;
	private String fragil;
	
	public Producto(double precioFabrica, String nombre, String codigo, String fechaAlta, String fragil) {
		
		this.precioFabrica = precioFabrica;
		this.nombre = nombre;
		this.codigo = codigo;
		this.fechaAlta = fechaAlta;
		this.fragil = fragil;
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

	public String getFragil() {
		return fragil;
	}

	public void setFragil(String fragil) {
		this.fragil = fragil;
	}
	
	public double calcPrecio (double costoTransporte) {
		double precioCosto;
		
		precioCosto = precioFabrica + costoTransporte;
		return precioCosto;
	}
	
	
}
