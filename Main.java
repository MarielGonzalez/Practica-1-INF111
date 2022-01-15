/*Ponderación.

1. Separar los datos de los 3 String                                           2

2. Determinar si sólo dos personas de las tres tienen el mismo nombre          2

3. Determinar cuál de los 3 números aleatorios es el más grande                2

4. Calcular los tiempos aparentes.                                             1

*/


import java.util.Scanner;
import java.util.Random; 

		public static void main(String[] args) {
		//*1. Entrada de nombres y fecha de cada empleado.
			
			System.out.println("Planilla de Evaluacion de Empleados");
			System.out.println("Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','):");
			
			Scanner scan = new Scanner(System.in);
			String ingresoPrimerPersona = scan.nextLine();
			int position = ingresoPrimerPersona.indexOf(",");
			String nombrePrimeraPersona = ingresoPrimerPersona.substring(0, position);
						
			String ingreso= ingresoPrimerPersona.substring(position+1 , ingresoPrimerPersona.length());
			int YearPrimeraPersona = Integer.parseInt(ingreso);  
			
			System.out.println("El nombre del empleado: " + nombrePrimeraPersona );
			System.out.println("El año de Ingreso es : " + YearPrimeraPersona );
			
			System.out.println("Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','):");
			String ingresoSegundaPersona = scan.nextLine();
			int position2 = ingresoSegundaPersona.indexOf(",");
			String nombreSegundaPersona = ingresoSegundaPersona.substring(0, position2);
			String ingreso2= ingresoSegundaPersona.substring(position2+1 , ingresoSegundaPersona.length());
			int YearSegundaPersona = Integer.parseInt(ingreso2);  
			
			System.out.println("El nombre del empleado: " + nombreSegundaPersona );
			System.out.println("El año de Ingreso es : " + YearSegundaPersona );
						
			System.out.println("Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','):");
			String ingresoTerceraPersona = scan.nextLine();
			int position3 = ingresoTerceraPersona.indexOf(",");
			String nombreTerceraPersona = ingresoTerceraPersona.substring(0, position3);
			String ingreso3= ingresoTerceraPersona.substring(position3+1 , ingresoTerceraPersona.length());
			int YearTerceraPersona = Integer.parseInt(ingreso3);  
			
			System.out.println("El nombre del primer empleado: " + nombreTerceraPersona );
			System.out.println("El año de Ingreso del primer empleado es : " + YearTerceraPersona );
					
					
			if((nombrePrimeraPersona.contentEquals(nombreSegundaPersona)) || (nombrePrimeraPersona.contentEquals(nombreTerceraPersona)))
			{
				
				System.out.println("help");
				int min = 0;
			    int max = 100;
				int randomNumber1 = (int)Math.floor(Math.random()*(max-min+1)+min);
				System.out.println(randomNumber1);
				int randomNumber2 = (int)Math.floor(Math.random()*(max-min+1)+min);
				System.out.println(randomNumber2);
				int randomNumber3 = (int)Math.floor(Math.random()*(max-min+1)+min);
				System.out.println(randomNumber3);
				
				if((randomNumber1>randomNumber2) && (randomNumber1>randomNumber3)) {
					System.out.println("El numero mayor es: " + randomNumber1);
				}else {
					if((randomNumber2>randomNumber1) && (randomNumber2>randomNumber3)) {
					System.out.println("El numero mayor es: " + randomNumber2);
				}else {
					if((randomNumber3>randomNumber1) && (randomNumber3>randomNumber2)) {
					System.out.println("El numero mayor es: " + randomNumber3);
				}   else {  
			         System.out.println("Numeros aleatorios no se distinguen");
				
			}else {
				System.out.println("ERROR");
			}
				
				
				
				
				//determinar cual es el tiempo aparente que tiene una persona en la empresa
			/*else {
				System.out.println("Calculo del tiempo del primer empleado(a) " + nombrePrimeraPersona);
				int tiempoAparente1 = YearPrimeraPersona-2022;
				System.out.printf("Primer Empleado: %s %d %d", nombrePrimeraPersona, nombrePrimeraPersona, tiempoAparente1);

				
				System.out.println("Calculo del tiempo del primer empleado(a)" + nombreSegundaPersona);
				int tiempoAparente2 = YearSegundaPersona-2022;
				
				System.out.println("Calculo del tiempo del primer empleado(a) " + nombreTerceraPersona);
				int tiempoAparente3 = YearTerceraPersona-2022; 
				
				System.out.printf("Primer Empleado: %s %d %d", nombrePrimeraPersona, nombrePrimeraPersona, tiempoAparente1);
				System.out.printf("Primer Empleado: %s %d %d", nombreSegundaPersona, YearSegundaPersona, tiempoAparente2);
				System.out.printf("Primer Empleado: %s %d %d", nombreTerceraPersona, YearTerceraPersona, tiempoAparente3);
				
						
				}*/
				
						
			
}


