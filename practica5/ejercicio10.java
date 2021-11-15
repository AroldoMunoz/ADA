package practica5;

public class ejercicio10 {
	//Q10:what is the time complexity of
	
	//sumatoria de numeros menores a n
	//la primera 0+1+2+...+n
	//la segunda 0^2+1^2+2^2+...+n^2
	public static void sumando(int n) {
		int contsum=0,contprod=0;	
		for(int i=1;i<=n;i++) {	
			contsum=contsum+i;//n veces pasa
					
		}
		System.out.println("la suma de valores es "+contsum);
		for(int j=1;j<=n;j++) {	
			contprod=contprod+j*j;//n veces pasa
					
		}
		System.out.println("la suma cuadrada valores es "+contprod);
		
	}
	/*A10
	 * 
	 * n+n=2n
	 * complejidad O(n) 	
	 */
			

	public static void main(String []args){
				
		sumando(6);
		sumando(10);
				
			}

		}




