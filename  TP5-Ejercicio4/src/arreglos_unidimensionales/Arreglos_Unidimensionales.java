package arreglos_unidimensionales;
import java.util.Scanner;
import java.util.Random;
public class Arreglos_Unidimensionales {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int CANT_ALUMNOS = 70;	
		String[] nombres_alumnos = new String[CANT_ALUMNOS];
		double[] notas_alumnos = new double[CANT_ALUMNOS];
		nombres_alumnos = inicializarArregloNombres(CANT_ALUMNOS, nombres_alumnos);
		notas_alumnos = inicializarArregloNotas(CANT_ALUMNOS, notas_alumnos);
		imprimirAlumnos(nombres_alumnos, notas_alumnos);
	}
	private static String[] inicializarArregloNombres(final int CANT_ALUMNOS, String[]nombres_alumnos) {
		for (int i = 0; i < nombres_alumnos.length; i++) {
			nombres_alumnos[i] = "Alumno" + 1;
		}
		return(nombres_alumnos);
	}
	
	private static double[] inicializarArregloNotas(final int CANT_ALUMNOS, double[]notas_alumnos) {
		for (int i = 0; i < notas_alumnos.length; i++) {
			notas_alumnos[i] = (Math.random() * (10 - 1) + 1);
		}
		return(notas_alumnos);
	}
	
	public static void imprimirAlumnos(String[]nombres_alumnos, double[]notas_alumnos) {
		
	}
}
