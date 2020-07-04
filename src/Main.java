import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int base = 0, exponente = 0;
		int acumulador = 1;
		 
		System.out.println("Ingrese la base");
		base = teclado.nextInt();
		System.out.println("Ingrese el exponente");
		exponente = teclado.nextInt();
		
		potencia(base,exponente,acumulador);
		
	} 
	
	static void potencia(int b, int e,int a) {
		
		a = a * b;
		if(e>1) {
			e--;
			potencia(b,e,a);
		}else {
			System.out.println("La potencia de "+b+" es: "+a);
		}
	}
	 
}