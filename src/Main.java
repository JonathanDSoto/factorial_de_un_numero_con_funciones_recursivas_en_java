import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0; 
		
		System.out.println("Ingrese por favor el número");
		numero = teclado.nextInt();
		
		factorial(numero,1); 
		
	}   
	
	static void factorial(int n, int a) {
		a = a*n; 
		
		if(n>1) {
			n--;
			factorial(n,a);
		}else {
			System.out.println("El factorial de es: "+a);
		}  
	}
	 
}