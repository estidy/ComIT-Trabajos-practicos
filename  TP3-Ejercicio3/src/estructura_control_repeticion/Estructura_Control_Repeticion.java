package estructura_control_repeticion;

import java.util.Scanner;

public class Estructura_Control_Repeticion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        final int CANTIDAD_PATENTES;
        int nroPatente;
        double valorPatente;
        double montoAabonar;
        double totalRecaudacion = 0;
        double PorcentajeNumeracionMayor1300000 = 0;
        int cantNumeracionMayor1300000 = 0;
        
        System.out.print("\n CANTIDAD PATENTES A PROCESAR: ");
        CANTIDAD_PATENTES = scan.nextInt();
        
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (int i = 0; i < CANTIDAD_PATENTES; i++) {
			nroPatente =  (int)(Math.random()* 5000000) + 100000;
			valorPatente =  Math.random()*(20000-1000) + 1000 ;
			if(nroPatente < 1000000) 
				montoAabonar = valorPatente * 0.05;
			else if(nroPatente <= 1000000 & nroPatente <= 2000000) {
				 montoAabonar = valorPatente * 0.1;
				 if(nroPatente > 1300000)
				    cantNumeracionMayor1300000++;
			}
			else {
				  montoAabonar = valorPatente * 0.15;
				  cantNumeracionMayor1300000++;				 
		    }
			System.out.printf("Nro Patente: %d \t Valor Sin Impuesto: %.2f \t Monto a Abonar con Impuesto: %.2f %n", nroPatente, valorPatente, montoAabonar);
			totalRecaudacion += montoAabonar;
		}
        PorcentajeNumeracionMayor1300000 = (cantNumeracionMayor1300000 * 100) / CANTIDAD_PATENTES;
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.printf("Monto total recaudado: %.2f %n", totalRecaudacion);
        System.out.printf("Porcentaje de autos cuya numeración fue superior 1300000:  %.0f%% %n",PorcentajeNumeracionMayor1300000);
        System.out.println("--------------------------------------------------------------------------------------------------");
	}

}
