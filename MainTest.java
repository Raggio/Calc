package Calc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MainTest {

	
	
	@Test
	public static void main(String[] args) {
		int numero1;
		int numero2;
		
		
		System.out.println("Introduce el primer numero");
		Scanner sc=new Scanner(System.in);
		numero1=sc.nextInt();
		System.out.println("Elije operación:");
		System.out.println("1-- Sumar");
		System.out.println("2-- Restar");
		System.out.println("3-- Multiplicar");
		System.out.println("4-- Dividir");
		
		int operacion=sc.nextInt();
		switch (operacion) {
		case 1: System.out.println("Introduce el valor a Sumar");
				numero2=sc.nextInt();
				Suma suma=new Suma(numero1,numero2);
				suma.Sumar();
			
			break;
		case 2: System.out.println("Introduce valor a restar");
				numero2=sc.nextInt();
				Resta resta=new Resta(numero1,numero2);
				resta.Restar();
			break;	
		case 3: System.out.println("Introduce valor a multiplicar");
				numero2=sc.nextInt();
				Multiplicacion multiplicacion=new Multiplicacion(numero1,numero2);
				multiplicacion.Multiplicar();
			break;
		case 4: System.out.println("Introduce valor a dividir");
				numero2=sc.nextInt();
				Division division=new Division(numero1, numero2);
				division.Dividir();
			break;
		
		
		
		default: System.out.println("Introduce un numero");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
