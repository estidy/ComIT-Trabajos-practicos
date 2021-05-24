package arreglos_unidimensionales;
import java.util.Random;
public class Arreglos_Unidimensionales {
	
	public static void main(String[] args) {
		final int CANT_ALUMNOS = 70;	
		String[] nombres_alumnos = new String[CANT_ALUMNOS];
		double[] notas_alumnos = new double[CANT_ALUMNOS];
		nombres_alumnos = inicializarArregloNombres(CANT_ALUMNOS, nombres_alumnos);
		notas_alumnos = inicializarArregloNotas(CANT_ALUMNOS, notas_alumnos);
		double promedio_notas = calcularPromedioNotas(notas_alumnos);
		imprimirAlumnosQueSuperanPromedio(nombres_alumnos, notas_alumnos, promedio_notas);		
	}
	private static String[] inicializarArregloNombres(final int CANT_ALUMNOS, String[]nombres_alumnos) {
		for (int i = 0; i < nombres_alumnos.length; i++) 
			nombres_alumnos[i] = "Alumno " + (i+1);
		return(nombres_alumnos);
	}
	
	private static double[] inicializarArregloNotas(final int CANT_ALUMNOS, double[]notas_alumnos) {
		for (int i = 0; i < notas_alumnos.length; i++) {
			notas_alumnos[i] = (Math.random() * (10 - 1) + 1);
		}
		return(notas_alumnos);
	}
	
	private static double calcularPromedioNotas(double[]notas_alumnos) {
		double suma = 0;
		for (int i = 0; i < notas_alumnos.length; i++) 
			 suma += notas_alumnos[i];
		return(suma /notas_alumnos.length);		
	}
	
	public static void imprimirAlumnosQueSuperanPromedio(String[]nombres_alumnos, double[]notas_alumnos, double promedio_notas) {
		System.out.printf("\t\tALUMNOS QUE SUPERAN LA NOTA PROMEDIO: %.2f %n", promedio_notas);
		System.out.println("***********************************************************************************");
		System.out.println("\t\tAPELLIDO Y NOMBRE \t\t|\t\t NOTA");
		System.out.println("***********************************************************************************");
		for (int i = 0; i < notas_alumnos.length; i++) {
			if(notas_alumnos[i] > promedio_notas) {
				System.out.printf("\tApellido y Nombre: %s \t\t|\t\t %.2f %n", nombres_alumnos[i], notas_alumnos[i]);
			    System.out.println("-----------------------------------------------------------------------------------");
			}
		}
		System.out.println("***********************************************************************************");
	}
}
