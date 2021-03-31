package com.senti.eti;

import java.io.*;

public class Caso5 {

	public static void main(String[] args) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			archivo = new File("datos.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			System.out.println(String.format("%-20s %-20s %-20s",
					"Nombre y Apellido","Distrito","Mes"));
			System.out.println(String.format("%-20s %-20s %-20s",
					"-----------------", "--------", "---"));
			
			String linea = "";
			
			while((linea = br.readLine()) != null) {
				String[] contenido = linea.split(";");
				
				for (int x = 0;x < contenido.length;x++)
					System.out.print(String.format("%-20s",
							Formatear(contenido[x])));
				
				System.out.println();
				//System.out.println(linea);
				
			}
		} catch (Exception ex1) {
			// Imprimir el detalle del error
			ex1.printStackTrace();
		} finally {
			//Cierre del archivo
			try {
				if(fr != null) fr.close();
			} catch (Exception ex2) {
				ex2.printStackTrace();
			}
		}

	}
	
	public static String Formatear(String cadena) {
		String[] palabra = cadena.split(" ");
		
		String resultado = "";
		
		for(int x = 0 ; x < palabra.length; x++)
			resultado += palabra[x].substring(0,1).toUpperCase() +
			             palabra[x].substring(1) + " ";
		return resultado;
	
	}

}
