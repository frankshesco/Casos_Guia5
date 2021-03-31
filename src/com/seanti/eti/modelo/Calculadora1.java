package com.seanti.eti.modelo;

public class Calculadora1 {
	//definicion de los atributos
		private float numero1;
		private float numero2;
		
		//obtener y esatablecer el valor del atributo
		//getters and setter
		public float getNumero1() {
			return this.numero1;
		}
		
		public void setNumero1(float n1) {
			this.numero1 = n1;
		}
		
		public float getNumero2() {
			return this.numero2;
		}
		
		public void setNumero2(float n2 ) {
			this.numero2 = n2;
		}
		
		//metodos constructores (polimorfismo)
		public Calculadora1() {
			
		}
	    
		public Calculadora1(float n1, float n2) {
			this.numero1 = n1;
			this.numero2 = n2;		
		}
		
		// metodos solicitados
		public float Suma() {
			return this.numero1 + this.numero2;
		}
		public float Resta() {
			return this.numero1 - this.numero2;
	    }
		public float Producto() {
			return this.numero1 * this.numero2;
		}
		public float Division() {
			float r = 0;
			
			if (this.numero2 != 0)
				r = this.numero1 / this.numero2;
		
			return r;
		}
		public float RestoEntero() {
			float r = 0;
			
			if (this.numero2 != 0)
				r = this.numero1 % this.numero2;
			
			return r;
		}
		// hallar el mayor de los dos numeros
		public float  MayorNumero() {
			if (this.numero1 > this.numero2)
				return this.numero1;
			else
				return this.numero2;
		}
		// menor numeero
		public float  MenorNumero() {
			if (this.numero1 > this.numero2)
				return this.numero2;
			else
				return this.numero1;
		
		}   
		
		
		    
			   
		    
			   
	}	



