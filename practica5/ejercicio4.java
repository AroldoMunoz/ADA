package practica5;

public class ejercicio4 {
	
		//Q4:what is the time complexity of
		//A4:complejidad O(n^2)
		//crea una matriz de * de orden nxn
		public static void matriz(int n) {
			for(int i=0;i<n;i++) {		//n+1
				for(int j=0;j<n;j++) {  //n*(n+1)
				System.out.print(" * ");//n*n
			}
			System.out.println();
			}
			System.out.println();
			
		}
		public static void main(String []args){
			
					
			matriz(5);
			
			
		}

}
