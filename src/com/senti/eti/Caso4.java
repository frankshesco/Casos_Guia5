package com.senti.eti;

import java.util.ArrayList;
import java.util.Scanner;

import com.seanti.eti.modelo.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			ArrayList<Publicacion> arrPublicacion = new ArrayList<Publicacion>();
	        
			Publicacion pl1 = new Publicacion("Los perros hambrientos","Ciro Alegria"   ,"L");
			Publicacion pl2 = new Publicacion("Tradiciones Peruanas"  ,"Ricardo Palma"  ,"L");
			Publicacion pl3 = new Publicacion("Informatica Global"    ,"Bill Gates"     ,"R");
			Publicacion pl4 = new Publicacion("Los Heraldos Negros"   ,"Cesar Vallejo"  ,"L");
			Publicacion pl5 = new Publicacion("Rev.Dig.Merca2.0"      ,"Mark Zuckerberg","R");
			
			String tit ="",aut = "",tip="";
			
			Publicacion pl6 = null;
			
			System.out.println("\n------Registro------");
			System.out.print("Titulo.............:");
			tit = sc.nextLine();
		    System.out.print("Autor..............:");
		    aut = sc.nextLine();
		    System.out.print("Tipo.............[L/R]");
		    tip = sc.nextLine();
		    
		    pl6 = new Publicacion(tit,aut,tip);
		    
		    arrPublicacion.add(pl1);
		    arrPublicacion.add(pl2);
		    arrPublicacion.add(pl3);
		    arrPublicacion.add(pl4);
		    arrPublicacion.add(pl5);
		    arrPublicacion.add(pl6);
		    
		    System.out.println("\n------------------- DATOS REGISTRADOS ---------------");
		    System.out.println("-------------------------------------------------------");
		    
		    String patron = "%-4s %-30s %-20s %-15s ";
		    System.out.println(String.format(patron, "N", " Titulo" , "Autor", " Tipo"));
		    System.out.println(String.format(patron,"---","--------", "-------","-----"));
		    
		    for(int x = 0; x <arrPublicacion.size(); x++)
		    	System.out.println(String.format(patron,(x + 1),arrPublicacion.get(x).Titulo(), 
		    			arrPublicacion.get(x).Autor(), arrPublicacion.get(x).MostrarTipo() ));
			
			
	      
			

			
	}

}
