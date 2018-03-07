package com.ssbaez.ejercicio437C;

import java.util.Scanner;

public class FactorialC {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int fac;
		int exp2;
		double result = 1;
		
		System.out.println("Aplicacion que estima el valor de 'e^x'");
		System.out.print("que utiliza la siguiente formula: ");
		System.out.println("e^x = 1 + x/1! + x^2/2! + x^3/3! + ...\n");
		System.out.println("Introduzca el exponente");
		System.out.print("----> ");
		int exp = input.nextInt();
		System.out.println("Introduzca el numero de terminos a calcular (a mas terminos mas exactitud)");
		System.out.print("----> ");
		int n = input.nextInt();
		
		while(n != 0) {
			
			int i = 0;
			int j = 1;
			fac = n;
			exp2 = n;
			
			while(i != n-1) {
				
				fac *= n - j;
				j++;
				i++;
				
			}
			
			result += (double) Math.pow(exp, exp2) / (double) fac;
			n--;
			
		}
		
		System.out.printf("El resultado es: %.9f",result);
		
	}

}
