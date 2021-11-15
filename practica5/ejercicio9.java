package practica5;

public class ejercicio9 {
	//Q9:what is the time complexity of
		
	//muestra todos los numeros cuadrados menores a n
	
	public static void cuadrados(int n) {
		
		for(int i=0;i*i<n;i++) {	
			System.out.println(i*i);
					
		}
		
	}
		/*A9
		 * 	condition i*i<n
		 * to finish i*i>=n
		 * we assume that  i^2=n
		 * i=sqrt
		 * 
		 * complejidad O(sqtr(n))	
		 */
			

			public static void main(String []args){
				
				
				cuadrados(20);
				
			}

		}




