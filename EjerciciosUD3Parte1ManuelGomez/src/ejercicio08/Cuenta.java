package ejercicio08;

public class Cuenta {

	private String nombreCuenta;
	private double saldo;
	
	public Cuenta(String nombreCuenta, double saldo) {
		super();
		this.nombreCuenta = nombreCuenta;
		this.saldo = saldo;
	}
	
	
	
	public String getNombreCuenta() {
		return nombreCuenta;
	}



	public double getSaldo() {
		return saldo;
	}

	

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void ingresarDinero(double cantidadIngresar) {
		
		saldo = saldo + cantidadIngresar;
		//NUNCA PONEMOS ASIGNACIONES EN EL RETURN;
	}
	public double retirarDinero( double cantidadRetirar) {
		
		if(saldo >= cantidadRetirar) {
			saldo = saldo - cantidadRetirar;
		}
		else {
			
		}
		
		return saldo;
	}
	
	public double cambiarDolar(double cambioDolar, double cambioEuro,double saldoDolar) {

		return saldoDolar = (saldo * cambioDolar)/cambioEuro;
	}
	
	public void mostrarDolar(double cambioDolar, double cambioEuro,double saldoDolar) {
		System.out.printf("Su dinero en $ %.2f",cambiarDolar(cambioDolar,cambioEuro,saldoDolar));
		System.out.println();
	}
	
	public void consultarSaldo() {
		
		System.out.println("Su saldo actual es de "+saldo+"€");
	}

}
