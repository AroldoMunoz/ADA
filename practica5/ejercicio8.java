package practica5;

public class ejercicio8 {
	//Q8:what is the time complexity of
		
	
	//divide sucesivamente el n  hasta llegar 1
	public static void divide(int n) {
		
		for(int i=n;i>=1;i=i/2) {	
			System.out.println(i);
					
		}
		
	}
		/*A8
		 * 	i	
		 * ---------------------
		 * 	n 	
		 * 	n/2
		 * 	n/2^2
		 * 	n/2^3
		 *	. 
		 *  .
		 *  n/2^k
		 *  asume i<1
		 *  therefore n/2^k<1
		 *  n=2^k
		 * complejidad O(log_2(n))	
		 */
			

			public static void main(String []args){
				
				
				divide(20);
				
			}

		}




