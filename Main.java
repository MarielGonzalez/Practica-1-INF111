
import java.util.Scanner;
import java.util.Date; 
import java.time.LocalDate;
import java.time.ZoneId;


class Main {
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
			
			System.out.println("\n");
			System.out.println("Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','):");
			String ingresoSegundaPersona = scan.nextLine();
			int position2 = ingresoSegundaPersona.indexOf(",");
			String nombreSegundaPersona = ingresoSegundaPersona.substring(0, position2);
			String ingreso2= ingresoSegundaPersona.substring(position2+1 , ingresoSegundaPersona.length());
			int YearSegundaPersona = Integer.parseInt(ingreso2);  
			
			System.out.println("El nombre del empleado: " + nombreSegundaPersona );
			System.out.println("El año de Ingreso es : " + YearSegundaPersona );
			System.out.println("\n");
						
			System.out.println("Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','):");
			String ingresoTerceraPersona = scan.nextLine();
			int position3 = ingresoTerceraPersona.indexOf(",");
			String nombreTerceraPersona = ingresoTerceraPersona.substring(0, position3);
			String ingreso3= ingresoTerceraPersona.substring(position3+1 , ingresoTerceraPersona.length());
			int YearTerceraPersona = Integer.parseInt(ingreso3);  
			System.out.println("\n");
			
			System.out.println("El nombre del empleado: " + nombreTerceraPersona );
			System.out.println("El año de Ingreso del primer empleado es : " + YearTerceraPersona );
					
					
			if((nombrePrimeraPersona.contentEquals(nombreSegundaPersona)) || (nombrePrimeraPersona.contentEquals(nombreTerceraPersona)))//reminder compare value second with the third.
			{
				
				System.out.println("Generando números aleatorios... ");
				int max = 100;
				int randomNumber1 = (int)Math.floor(Math.random()*(max));
				System.out.println(randomNumber1);
				int randomNumber2 = (int)Math.floor(Math.random()*(max));
				System.out.println(randomNumber2);
				int randomNumber3 = (int)Math.floor(Math.random()*(max));
				System.out.println(randomNumber3);
				
				if((randomNumber1>randomNumber2) && (randomNumber1>randomNumber3)) {
					System.out.println("El numero mayor es: " + randomNumber1);
				}else if((randomNumber2>randomNumber1) && (randomNumber2>randomNumber3)) {
					System.out.println("El numero mayor es: " + randomNumber2);
				}else if((randomNumber3>randomNumber1) && (randomNumber3>randomNumber2)) {
					System.out.println("El numero mayor es: " + randomNumber3);
				}else{
					System.out.println("Numeros aleatorios no se distinguen");
				} 

				if(a>=b && a>=c)  
					System.out.println(a+" is the largest Number");  
				else if (b>=a && b>=c)  
					System.out.println(b+" is the largest Number");  
				else  
					System.out.println(c+" is the largest number");  
				
			}		
							
				//determinar cual es el tiempo aparente que tiene una persona en la empresa
			else {
				Date date = new Date();

		        ZoneId localTimeZone = ZoneId.systemDefault();
		        LocalDate getLocalDateTime = date.toInstant().atZone(localTimeZone).toLocalDate();
		        int añoActual=(getLocalDateTime.getYear());
		        
		        System.out.println("\n");
				System.out.println("Calculo del tiempo de empleados(as)" + nombrePrimeraPersona);
				int tiempoAparente1 = añoActual-YearPrimeraPersona;
				int tiempoAparente2 = añoActual-YearSegundaPersona;
				int tiempoAparente3 = añoActual-YearTerceraPersona;

				String template = "\n Ingreso de Empleados: %s (%d), %d años  en la empresa  ";
				System.out.printf(template, nombrePrimeraPersona,YearPrimeraPersona, tiempoAparente1);
				System.out.printf(template, nombreSegundaPersona,YearSegundaPersona, tiempoAparente2);
				System.out.printf(template, nombreTerceraPersona,YearTerceraPersona, tiempoAparente3);
						
			}
								
			
	}
}
