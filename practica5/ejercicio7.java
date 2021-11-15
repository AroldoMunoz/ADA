package practica5;

public class ejercicio7 {
	//Q7:what is the time complexity of
		
	//halla el logaritmo entero de un numero n>0
	public static int logaritmo(int n) {
		int cont=-1;
		for(int i=1;i<=n;i=i*2) {	
			cont++;
					
		}
		return cont;
		
	}
		/*A7
		 * 	i	
		 * ---------------------
		 * 	1 	
		 * 	1*2=2
		 * 	2*2=2^2
		 * 	2*2^2=2^3
		 *	. 
		 *  .
		 *  2^k
		 *  asume i>=n
		 *  therefore i=2^k
		 *  2^k>=n
		 *  2^k=n
		 *  k=log_2(n)
		 *   
		 * complejidad O(log_2(n))	
		 */
			

			public static void main(String []args){
				
				
				System.out.println(logaritmo(64));
				System.out.println(logaritmo(65));
				System.out.println(logaritmo(63));
				
			}

		}




