package modularizacion;
import java.util.Scanner;
import java.lang.Math;
public class Modularizacion {
	//variables global.
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {	
    	boolean salir = false;
		while (!salir) {
			mostrarMenu();
			int opcion = solicitarValorEntero("\033[34mIngrese su Opcion: ");
			scan.nextLine();
			salir = validarOpcion(opcion);
		}
		System.out.println("\033[32m-GRACIAS POR UTILIZAR EL SISTEMA-");
	}
	
	private static void mostrarMenu() {
		System.out.println("\033[32m-----------------------------------------------MENU-----------------------------------------------");
		System.out.println("OPCION 1. Calcular Área del Círculo");
		System.out.println("OPCION 2. Calcular Área del Cuadrado");
		System.out.println("OPCION 3. Calcular Área del Rectángulo");
		System.out.println("OPCION 4. Calcular Área del Triángulo");
		System.out.println("OPCION 5. Calcular Área del Trapecio");
		System.out.println("OPCION 6. Salir");
		System.out.println("\033[32m--------------------------------------------------------------------------------------------------");
	}
	
	private static void imprimirMensaje(String msj) {
		System.out.println(msj);
	}
	private static int solicitarValorEntero(String msj) {
		imprimirMensaje(msj);
		return(scan.nextInt());
	}
	private static double solicitarValorDouble(String msj) {
		imprimirMensaje(msj);
		return(scan.nextDouble());
	}
	
	private static boolean validarOpcion(int opcion) {
		boolean salir = false;
	     switch (opcion) {
				case 1: {System.out.println("metodo que calcula el area de un círculo");
				         calcularAreaCirculo();
		                 break;
		                }
				case 2: {System.out.println("metodo que calcula el area de un cuadrado");
				         calcularAreaCuadrado();
				         break;
				        }
				case 3: {System.out.println("metodo que calcula el area de un rectangulo");
				         calcularAreaRectangulo();
		                 break;
		                }
				case 4: {System.out.println("metodo que calcula el area de un triangulo");
				         calcularAreaTriangulo();
		                 break;
		                }
				case 5: {System.out.println("metodo que calcula el area de un trapecio");
				         calcularAreaTrapecio();
		                 break;
		                }
				case 6: {salir = true;
				         break;
				        }
				default: System.err.println("Opcion Invalida (opciones validas: 1 - 2 - 3 - 4 -5)");         
		 }	
	        return(salir?true:false);
	}
	
	
	private static void calcularAreaCirculo() {
		double metros = solicitarValorDouble("-Ingrese el radio(expresado en metros)-");
		scan.nextLine();
		if(metros>0)
			System.out.printf("El área es: %.2f %n", Math.PI * Math.pow(metros,2));
		else {
			imprimirMensaje("\033[31mEl numero debe ser mayor a 0. Intentelo Nuevamente");
			calcularAreaCirculo();
		}
	}
	
	private static void calcularAreaCuadrado() {
		double lado = solicitarValorDouble("-Ingrese el lado(expresado en metros)-");
		scan.nextLine();
		if(lado>0)
			System.out.printf("El área es: %.2f %n", Math.pow(lado,2));
		else {
			imprimirMensaje("\033[31mEl numero debe ser mayor a 0. Intentelo Nuevamente");
			calcularAreaCuadrado();
		}
	}
	
	private static void calcularAreaRectangulo() {
		
	}
	
	private static void calcularAreaTriangulo() {
		
	}
    private static void calcularAreaTrapecio() {
		
	}
}
