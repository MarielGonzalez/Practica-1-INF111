/*Grupo 2
 * INTEGRANTES;
 * 
 * Scarlet Gonzalez   A00106364
 * Amy Macias		  	
 * Jeromy Mercedes
 * 
 * */


import java.util.Scanner;
import java.util.Date; 
import java.time.LocalDate;
import java.time.ZoneId;

public class planillaEmpleados {

		public planillaEmpleados() {		
	}

		public static void main(String[] args) {
		//*1. Entrada de nombres y fecha de cada empleado.
			
			System.out.println("Planilla de Evaluacion de Empleados");
			System.out.println("Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','):");
			
			Scanner scan = new Scanner(System.in);
			String ingresoPrimerPersona = scan.nextLine();
			int position = ingresoPrimerPersona.indexOf(",");
			String nombrePrimeraPersona = ingresoPrimerPersona.substring(0, position);
						
			String ingreso= ingresoPrimerPersona.substring(position+1 , ingresoPrimerPersona.length());
			int yearPrimeraPersona = Integer.parseInt(ingreso.trim());  
			
			System.out.println("Nombre del empleado: " + nombrePrimeraPersona );
			System.out.println("Año de Ingreso :" + yearPrimeraPersona );
			
			System.out.println("\n Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','): ");
			String ingresoSegundaPersona = scan.nextLine();
			int position2 = ingresoSegundaPersona.indexOf(",");
			String nombreSegundaPersona = ingresoSegundaPersona.substring(0, position2);
			String ingreso2= ingresoSegundaPersona.substring(position2+1 , ingresoSegundaPersona.length());
			int yearSegundaPersona = Integer.parseInt(ingreso2.trim());  
			
			System.out.println("Nombre del empleado: " + nombreSegundaPersona );
			System.out.println("Año de Ingreso: " + yearSegundaPersona );
									
			System.out.println(" \n Ingrese el Nombre del empleado y el año de ingreso separado por una coma(','): ");
			String ingresoTerceraPersona = scan.nextLine();
			int position3 = ingresoTerceraPersona.indexOf(",");
			String nombreTerceraPersona = ingresoTerceraPersona.substring(0, position3);
			String ingreso3= ingresoTerceraPersona.substring(position3+1 , ingresoTerceraPersona.length());
			int yearTerceraPersona = Integer.parseInt(ingreso3.trim());  
					
			System.out.println("Nombre del empleado: " + nombreTerceraPersona );
			System.out.println("Año Ingreso : " + yearTerceraPersona );
					
			if((nombrePrimeraPersona.contentEquals(nombreSegundaPersona)) 
			   || (nombrePrimeraPersona.contentEquals(nombreTerceraPersona)) 
			   || (nombreSegundaPersona.contentEquals(nombreTerceraPersona))){
				
				System.out.println(" \n Dos de estos empleados tienen los mismos nombres... \n Generando números aleatorios... ");
				int max = 100;
				int randomNumber1 = (int)Math.floor(Math.random()*(max));
				int randomNumber2 = (int)Math.floor(Math.random()*(max));
				int randomNumber3 = (int)Math.floor(Math.random()*(max));
				System.out.println(randomNumber1 + "\n" + randomNumber2 + "\n" + randomNumber3);
								
				if((randomNumber1>=randomNumber2) && (randomNumber1>=randomNumber3)) {
					System.out.println("El numero mayor es: " + randomNumber1);
				}else if((randomNumber2>=randomNumber1) && (randomNumber2>=randomNumber3)) {
					System.out.println("El numero mayor es: " + randomNumber2);
				}else 		   
				    System.out.println("El numero mayor es: " + randomNumber3);
				 							
			}else 
				{//determinar cual es el tiempo aparente que tiene una persona en la empresa
				//Aqui preferiblemente usamos el año en curso para realizar el calculo sin hardcodear
				Date fecha = new Date();
		        ZoneId localTimeZone = ZoneId.systemDefault();
		        LocalDate getfechaLocal = fecha.toInstant().atZone(localTimeZone).toLocalDate();
		        int añoActual=(getfechaLocal.getYear());
		        
		    int tiempoEmpleado1 = añoActual-yearPrimeraPersona;
				int tiempoEmpleado2 = añoActual-yearSegundaPersona;
				int tiempoEmpleado3 = añoActual-yearTerceraPersona;
		        
		    System.out.println("\n");
		    String texto = "\n Ingreso de Empleados: %s (%d), %d años  en la empresa  ";
		    System.out.printf(texto, nombrePrimeraPersona,yearPrimeraPersona, tiempoEmpleado1);
				System.out.printf(texto, nombreSegundaPersona,yearSegundaPersona, tiempoEmpleado2);
				System.out.printf(texto, nombreTerceraPersona,yearTerceraPersona, tiempoEmpleado3);
				}
			
							
		}
	}

