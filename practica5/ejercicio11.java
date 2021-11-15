package practica5;

public class ejercicio11 {
	//Q11:what is the time complexity of
	//calculamos el
	//log_2(log_2(n))
	public static void logdoble(int n) {
		int p=0,cont=-1;	
		for(int i=1;i<n;i=i*2) {	
			p++;//p=log(n)
			
					
		}
		//System.out.println(p);
		for(int j=1;j<p;j=j*2) {
			cont++;//log p
					
		}
	System.out.println("log_2(log_2("+n+"))= "+cont);
			}
	
	/*A11
	 * p=log(n)
	 * log(p)
	 * log(log(n))
	 * complejidad(log(log(n)))
	 */
			

	public static void main(String []args){
				
		logdoble(10000);
		logdoble(100000);		
			}

		}




