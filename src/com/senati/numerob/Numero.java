package com.senati.numerob;

public class Numero {

	
		// ------------ Declaracion de los atributos ---------- //
		
		public double Num;

		// ------------- Declaración de los constructores --------//
		
		public Numero() {
			super();
		}

		// ------------- Declaración de los constructores --------//
		public Numero(double num) {
			super();
			Num = num;
		}

		
		// ------------ Declarar los Getters y Setters -------------------- //
				
		public double getNum() {
			return Num;
		}

		public void setNum(double num) {
			Num = num;
		}

	

		// ----------- Metodo toString() ---------- //
		
		
		@Override
		public String toString() {
			return "Numero [Num=" + Num + "]";
		}
		
		
		// ----------- metodos() ---------- //
		
		public String Primo() {
			String men;
			int a=0;
			for(double i=1;i<=Num;i++) {
				if (Num % i  == 0) {
					a++;
				}
			}
			if (a==2) {
				men="Número es primo";
			}else {
				men="Número no es primo";
			}		
			return men;
		}
		
		public String Perfecto() {
			String men;
			double a=0;
			for (double i=1;i<Num;i++) {
				if (Num % i == 0) {
					a = a + i;
				}
			}
			if (a==Num) {
				men="Número es perfecto";
			}
			else {
				men="Número no es perfecto";
			}
			return men;
		}
		

		public String CondicionNota()
		{
			String men;
			double a;
			a=Num;
			if (a>10) {
				men="APROBADO";
			}
			else {
				men="DESAPROBADO";
			}
			return men;
		}
		
		
		public String PositivoNegativo()
		{
			String men;
			double a;
			a=Num;
			if (a>0) {
				men="POSITIVO";
			}
			else {
				men="NEGATIVO";
			}
			return men;
		}
		
		
		public double Factorial() {
			double fac=1;
			double x;
			x = Num;
			while (x != 0) {
				fac = fac * x;
				x--;
			}	
			return fac;
		}

		
	
}
