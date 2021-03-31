package com.senti.eti;



import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Primer numero....: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo numero....: ");
		float n2 = sc.nextFloat();
		
		Calculadora2 calc = new Calculadora2(n1, n2);
		
		System.out.println("\nNUMEROS INGRESADOS");
		System.out.println("-----------");
		System.out.println("Numero 1 .........:" + calc.getNumero1());
		System.out.println("Numero 2 .........:" + calc.getNumero2());
		System.out.println("RESULTADOS");
		System.out.println("-----------");
		System.out.println("Suma          :" + calc.Operar(1));
		System.out.println("Resta         :" + calc.Operar(2));
		System.out.println("Producto      :" + calc.Operar(3));
		;
		
		
		
		
	


	}

}
