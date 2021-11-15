package practica5;

public class ejercicio5 {
	//Q5:what is the time complexity of
	
		//crea una piramide triangular de * de base n-1 y altura n-1 
		public static void matriz1(int n) {
			for(int i=0;i<n;i++) {		
				for(int j=0;j<i;j++) {	
				System.out.print(" * ");
			}
			System.out.println();
			}
			System.out.println();
			
		}
		//A5:complejidad O(n^2)
		/* i	 j	 	time
		 * 0	 0	x	0
		 * ----------------
		 * 1	0	v	1
		 * 		1	x
		 * ----------------
		 * 2	0	v	2
		 * 		1	v
		 * 		2	x
		 * -----------
		 * n			n
		 * 
		 *o(n^2)	 
		 * */
	
	
public static void main(String []args){
		
		
		matriz1(5);
		
	}

}
