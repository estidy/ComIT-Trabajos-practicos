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
	
	private static boolean validarOpcion(int opcion) {
		boolean salir = false;
	     switch (opcion) {
				case 1: {
				         calcularAreaCirculo();
		                 break;
		                }
				case 2: {
				         calcularAreaCuadrado();
				         break;
				        }
				case 3: {
				         calcularAreaRectangulo();
		                 break;
		                }
				case 4: {
				         calcularAreaTriangulo();
		                 break;
		                }
				case 5: {
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
	private static void imprimirMensaje(String msj) {
		System.out.println(msj);
	}
	private static int solicitarValorEntero(String msj) {
		imprimirMensaje(msj);
		return(scan.nextInt());
	}
	private static double solicitarValorDouble(String msj) {		
		imprimirMensaje(msj);
		double valor = scan.nextDouble();
		if(valor > 0)
			return (valor);
		else {
			imprimirMensaje("\033[31mEl numero debe ser mayor a 0. Intentelo Nuevamente");
			return(solicitarValorDouble(msj));
		}
	}
	
	private static void imprimirArea(double area, String figura) {
		System.out.printf("El área del %s es: %.2f metros cuadrados %n", figura, area);
	}	
	
	private static void calcularAreaCirculo() {
		double metros = solicitarValorDouble("-Ingrese el radio(expresado en metros)-");
		scan.nextLine();
		imprimirArea((Math.PI * Math.pow(metros,2)),"CÍRCULO" );
	}
	
	private static void calcularAreaCuadrado() {
		double lado = solicitarValorDouble("-Ingrese el lado(expresado en metros)-");
		scan.nextLine();
		imprimirArea((Math.pow(lado,2)), "CUADRADO");
	}
	
	private static void calcularAreaRectangulo() {
		double base = solicitarValorDouble("-Ingrese la base (expresado en metros)-");
		double altura = solicitarValorDouble("-Ingrese la altura (expresado en metros)-");
		scan.nextLine();	
		imprimirArea((base * altura), "RECTÁNGULO");
	}
	
	private static void calcularAreaTriangulo() {
		double base = solicitarValorDouble("-Ingrese la base (expresado en metros)-");
		double altura = solicitarValorDouble("-Ingrese la altura (expresado en metros)-");	
		scan.nextLine();	
		imprimirArea( ((base * altura)/2), "TRIÁNGULO");
	}
    private static void calcularAreaTrapecio() {
    	double baseMenor = solicitarValorDouble("-Ingrese la base menor (expresado en metros)-");
		double baseMayor = solicitarValorDouble("-Ingrese la base mayor (expresado en metros)-");	
		double altura = solicitarValorDouble("-Ingrese la altura (expresado en metros)-");	
		scan.nextLine();	
		imprimirArea( (((baseMayor + baseMenor)/2) * altura), "TRAPECIO");
	}
}
