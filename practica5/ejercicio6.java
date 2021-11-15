package practica5;

public class ejercicio6 {
		//Q6:what is the time complexity of
	
		//programa de sumatoria de 1 hata un n
	public static int sum(int n) {
	
		int p=0;
		for(int i=1;p<=n;i++) {		
			p=p+i;
				
		}
		return p;
	}
	/*A6
	 * 	i	p
	 * ---------------------
	 * 	1 	0+1=1
	 * 	2	1+2
	 * 	3	1+2+3
	 * 	4	1+2+3+4
	 * 	.
	 * 	.
	 * 	k	1+2+3+4+...+k
	 * 
	 * asume k>n
	 * p=(k*(k+1)/2)
	 * 		p>n
	 * k*(k+1)/2>n
	 * k^2>n
	 * k>sqrt(n)
	 * 
	 * complejidad O(n^(1/2))	
	 */
		

		public static void main(String []args){
			
			
			System.out.println(sum(6));
			
		}

	}


