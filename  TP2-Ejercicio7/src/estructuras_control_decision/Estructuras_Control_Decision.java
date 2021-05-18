package estructuras_control_decision;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estructuras_Control_Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat d = new DecimalFormat("##.00");	
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Scanner scan = new Scanner(System.in);
		
		 //Lectura de datos.
		
		System.out.println("Edad:");
		int edad = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Experiencia:");
		int experiencia = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Remuneracion estimativa:");
		double remuneracion = scan.nextDouble();
		scan.nextLine();
		
		//Evaluacion

		if (edad >= 18 & edad <= 35) {
			if (experiencia < 3 & remuneracion < 5000)
				System.out.println("Aspirante Contratado");
			else if (experiencia > 3 & experiencia < 6)
					System.out.println("Aspirante Contratado de Forma Condicional");
			else if(experiencia >= 6 & edad > 32)
					System.out.println("Aspirante Contratado");
			else
				System.out.println("Aspirante Rechazado");
		}
		else
			System.out.println("Aspirante Rechazado");		
		
	}

}
