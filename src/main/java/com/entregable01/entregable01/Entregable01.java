package com.entregable01.entregable01;

public class Entregable01 {
	
	public static void splitNumber(float x){
		
		int a = (int)x;
		double b = (double)x%1; 
		System.out.println("El numero original es: " + x);
		System.out.println("La parte entrea es: "+ a);
		System.out.println("La parte decimal es: "+ b);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		splitNumber(10.26f);	

	}

}
