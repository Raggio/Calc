package Calc;

public class Division {

	int numero1;
	int numero2;
		
	public Division(int numero1,int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
		
		}
	
	public int Dividir() {
		int resultado;
		resultado=this.numero1/this.numero2;
		System.out.println("El resultado es " + resultado);	
		return resultado;
		
	}
}
