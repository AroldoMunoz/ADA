package practica5;

public class ejercicio12 {
	//Q12:what is the time complexity of
	//muestra las convinaciones coordenadas 
	//de x = 1 hasta n, con y=1 hasta 2^k donde 2^k<n
	public static void coordena(int n) {
		int cont=0;
		for(int i=0;i<n;i++) {	//(1)
			for(int j=1;j<n;j=j*2) {//(2)
				System.out.print("("+(i+1)+","+j+")");//(3)
				}
			System.out.println();
			}
	}
	
	/*A12
	 * (1)this repeats n times
	 * (2)and this inner loop n times*log(n)
	 * (3)and this statement n times*log(n)
	 * adding then together n+2n+log(n)
	 * complejidad O(n log(n))
	 */
			

	public static void main(String []args){
				
		coordena(16);
				
			}

		}




