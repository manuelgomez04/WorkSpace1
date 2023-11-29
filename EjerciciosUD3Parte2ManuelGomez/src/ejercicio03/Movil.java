package ejercicio03;

public class Movil {
	private String marca; 
	private String modelo;
	private boolean vendido;
	private boolean nuevo;
	private double precioUnitario;
	private int codigo;
	
	public Movil(String marca, String modelo, boolean vendido, boolean nuevo, double precioUnitario, int codigo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.nuevo = nuevo;
		this.precioUnitario = precioUnitario;
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", nuevo=" + nuevo
				+ ", precioUnitario=" + precioUnitario + ", codigo=" + codigo + "]";
	}

	
	
	
	
}

	