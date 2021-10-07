package practica1;
//suma de numeros de un arreglo
public class ejercicio1 {
	
	public static void main(String[] args) {
		
		int arreglo[] = { 1,2,3,4};
			
		int sum = 0;
		for (int i=0; i<arreglo.length; i++) 
			sum = sum+arreglo[i];
		
		System.out.printf("Suma: "+sum);
		
	}
}
