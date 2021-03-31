package com.senti.eti;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import com.seanti.eti.modelo.Alumno;

public class Caso6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("=================");
			
			System.out.println("Nombre........: ");
			String nom = sc.nextLine();
			System.out.println("Apellido......: ");
			String ape = sc.nextLine();
			System.out.println("Genero <M/F>..:  ");
			String gen = sc.nextLine();
			System.out.println("Edad [15-30]...");
			int ed = sc.nextInt();
			
			Alumno alu = new Alumno(nom, ape, gen, ed);
			
			//escribir los datos en el archivo de texto
			pw.println("Datos Registrados");
			pw.println("-----------------");
			pw.println("Nombre y Apellido....: " + alu.NombreCompleto());
			pw.println("Genero.....: " + alu.MostrarGenero());
			pw.println("Edad: " + alu.MostrarEstado());
			
			System.out.println("Se creo el archivo correctamente...");
			
		} 	catch (Exception ex1 ) {
			//IMPRImir el detalle del error
			ex1.printStackTrace();
		} finally {
			//cierre del archivo
			try {
				if (archivo != null) archivo.close();	
			} catch ( Exception ex2) {
				ex2.printStackTrace();
			}	
		}



	}

}
