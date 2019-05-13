package Calc;

public class Multiplicacion {

	
	int numero1;
	int numero2;
		

	public Multiplicacion(int numero1, int numero2) {
		
		this.numero1=numero1;
		this.numero2=numero2;
		
	}
	
	public int Multiplicar() {
		int resultado;
		resultado= this.numero1*this.numero2;
		System.out.println("El resultado es " + resultado);	
		return resultado;
		
		
		
	}
}
