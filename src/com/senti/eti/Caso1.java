package com.senti.eti;

import java.util.Scanner;


import com.seanti.eti.modelo.Calculadora1;

public class Caso1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		Calculadora1 calc = new Calculadora1();
		
		System.out.print("Primer numero....: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo numero....: ");
		float n2 = sc.nextFloat();
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("\nNUMEROS INGRESADOS");
		System.out.println("-----------");
		System.out.println("Numero 1 .........:" + calc.getNumero1());
		System.out.println("Numero 2 .........:" + calc.getNumero2());
		System.out.println("RESULTADOS");
		System.out.println("-----------");
		System.out.println("Suma          :" + calc.Suma());
		System.out.println("Resta         :" + calc.Resta());
		System.out.println("Producto      :" + calc.Producto());
		if (n2 ==0) {
			System.out.println(" division.......: No es posible:");
		}
		else
			System.out.println("Division      :" + calc.Division());
		if (n2 ==0) {
			System.out.println("Resto entero ........: No es posible:");
		}
		else
			System.out.println("Resto entero  :" + calc.RestoEntero());
		
		System.out.println("Numero mayor     :" + calc.MayorNumero());
		System.out.println("Numero menor     :" + calc.MenorNumero());
		
		
		
		
	

	


	}

}
