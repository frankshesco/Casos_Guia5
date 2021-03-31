package com.senti.eti;

import java.util.ArrayList;
import java.util.Scanner;

import com.seanti.eti.modelo.Alumno;

public class Caso3 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in);  
		  
			// Conjunto de datos de tipo Alumno
				ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
				
				//Forma 1 de ingrsar datos
				Alumno al1 = new Alumno();
				al1.setNombre("Joe");
				al1.setApellido("Castillo");
				al1.setGenero("M");
				al1.setEdad(25);
				
				// Forma 2 de ingresar datos
				Alumno al2 = new Alumno("Rosa", "Flores", "F", 15);
				
				// Forma 3 de ingresar datos
				
				String nom = "", ape = "", gen = "F", continuar = "S";
				int ed = 0, nr = 0;
				
				Alumno al3 = null;
				while (continuar.equals("S")|| continuar.equals("s")) {
					nr++;
					System.out.println("\n---------------------");
					System.out.println("REGISTRO -" + nr + "- DE DATOS");
					System.out.println("---------------------");
					System.out.print("Nombre.........: ");
					nom = sc.nextLine();
					System.out.print("Apellido.........: ");
					ape = sc.nextLine();
					System.out.print("Género<F/M>......: ");
					gen = sc.nextLine();
					while (!gen.equals("F") && !gen.equals("f") && !gen.equals("M") && !gen.equals("m")) {
						
						if (!gen.equals("F") && !gen.equals("f") && !gen.equals("M") && !gen.equals("m")) {
							System.out.println("\n********");
							System.out.println("Solo escriba F o M");
							System.out.println("******");
							System.out.print("\nGénero<F/M>......: ");
							gen = sc.nextLine();
								
						}
					}
					
					System.out.print("Edad [15-30]....: ");  //Falta poner para que si ponemos una edad que no está en el rango haya un mensaje
					ed = sc.nextInt();
					
					sc.nextLine();
					continuar = "";
					while (!continuar.equals("S") && !continuar.equals("s") && !continuar.equals("N") && !continuar.equals("n")) {
					
						System.out.print("¿Continuar registro [S|N]?: ");
						continuar = sc.nextLine();
						
						if (!continuar.equals("S") && !continuar.equals("s") && !continuar.equals("N") && !continuar.equals("n")) {
							System.out.println("Solo escriba S o N");
						}
					}
					al3 = new Alumno(nom, ape, gen, ed);
					
					// AGREGAR LOS OBJETOS AL CONJUNTO DE DATOS DE TIPO ALUMNO
					
					arrAlumno.add(al3);
				}
				arrAlumno.add(al1);
				arrAlumno.add(al2);
				
				// IMPRESIÓN DEL ARRAYLIST
				System.out.println("\n-------------------------");
				System.out.println(" -- DATOS REGISTRADOS -- ");
				System.out.println("-------------------------\n");
				
				String patron = "%-4s %-20s %-10s %-15s";
				System.out.println(String.format(patron, "N", "Nombres y Apellidos", "Género", "Estado"));
				System.out.println(String.format(patron, "--", "-------------------", "------", "------"));
				
				for (int x = 0; x < arrAlumno.size(); x++)
					System.out.println(String.format(patron, (x + 1), arrAlumno.get(x).NombreCompleto(),
							arrAlumno.get(x).MostrarGenero(), arrAlumno.get(x).MostrarEstado()));

	}

}
