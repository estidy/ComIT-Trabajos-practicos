package modularizacion;
import java.util.Scanner;
public class Modularizacion {
	//variable global.
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		mostrarMenu();
		int opcion = solicitarOpcion("Ingrese su Opcion: ");
		scan.next();
		calcularAreaParaOpcion(opcion);
	}
	
	private static void mostrarMenu() {
		System.out.println("-----------------------------------------------MENU-----------------------------------------------");
		System.out.println("OPCION 1. Calcular �rea del C�rculo");
		System.out.println("OPCION 2. Calcular �rea del Cuadrado");
		System.out.println("OPCION 3. Calcular �rea del Rect�ngulo");
		System.out.println("OPCION 4. Calcular �rea del Tri�ngulo");
		System.out.println("OPCION 5. Calcular �rea del Trapecio");
		System.out.println("--------------------------------------------------------------------------------------------------");
	}
	
	private static int solicitarOpcion(String msj) {
		System.out.println(msj);
		return(scan.nextInt());
	}

}
