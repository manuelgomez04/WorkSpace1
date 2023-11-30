package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, marca, modelo;
		boolean vendido = true, segundaMano;
		int opcion, seguir, numMv = 0, segunM, codMV;
		double pagado, precioUnitario;
		Movil lista []  = new Movil [4];
		Movil m;
		Vendedor v;
		
		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Agregar móviles
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					do {
						System.out.println("Diga modelo");
						modelo = sc.nextLine();
						
						System.out.println("Diga marca");
						marca = sc.nextLine();
						
						System.out.println("Es de segunda mano? (1 sí, 2 no)");
						aux = sc.nextLine();
						segunM = Integer.parseInt(aux);
						
						if (segunM == 1) {
							segundaMano = true;				
						} else {
							segundaMano = false;
						}
						
						System.out.println("Diga precio unitario");
						aux = sc.nextLine();
						precioUnitario= Double.parseDouble(aux);
						
						System.out.println("Diga código");
						aux = sc.nextLine();
						codMV = Integer.parseInt(aux);
						
						m = new Movil (marca, modelo, vendido, segundaMano, precioUnitario, codMV);
						v  = new Vendedor (lista, numMv);
						v.agregar(m);
						
						
						System.out.println("0 para dejar de rellenar, cualquier otro número para seguir rellenando");
						aux = sc.nextLine();
						seguir = Integer.parseInt(aux);
						
					} while (seguir != 0 || numMv > lista.length);
					
					
					do {
						System.out.println("""
								0 ---> Salir
								1 ---> Comprobar cuantos móviles quedan sin vender
								2 ---> Calcular precio del dispositivo
								3 ---> Mostrar el cambio
								4 ---> Total al acabar el día
								5 ---> Vender un móvil
								""");
						aux = sc.nextLine();
						opcion = Integer.parseInt(aux);
						
						switch(opcion) {
							case 1:
								v.comprobarSinVender();
								v.mostrarSinVender();
								
							break;
							case 2 :
								System.out.println("Diga el código del móvil por buscar");
								aux = sc.nextLine();
								codMV = Integer.parseInt(aux);
								v.buscar(codMV);
								v.mostrarPrecio(codMV);;
							break;
							case 3:
								System.out.println("Diga con cuanto ha pagado");
								aux = sc.nextLine();
								pagado = Integer.parseInt(aux);
								while (pagado < m.getPrecioUnitario()) {
									System.out.println("Dinero insuficiente, diga cantidad correcta");
									aux = sc.nextLine();
									pagado =Double.parseDouble(aux);
									}							
								v.mostrarCambio(pagado, codMV);
							break;
							
							case 4:
								v.mostrarTotal();
							break;
							
							case 5: 
								System.out.println("Diga el código del móvil por vender");
								aux = sc.nextLine();
								codMV = Integer.parseInt(aux);
								v.buscar(codMV);
								v.vendido(codMV);
							break;
						}
						
					} while (opcion != 0);
					
				break;
	
				default:
				break;
			}
			
			
			
			
			
			
			
			
		} while (opcion != 0);
	
		
		
		
		
		
	}

}
