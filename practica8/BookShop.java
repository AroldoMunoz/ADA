package practica8;

import java.util.Scanner;
public class BookShop{
	//ejercicio boos shop
		/*Est�s en una librer�a que vende n libros diferentes. 
		 * Sabes el precio y el n�mero de p�ginas de cada libro.
		 * Ha decidido que el precio total de sus compras ser� como m�ximo x. 
		 * �Cu�l es el n�mero m�ximo de p�ginas que puede comprar? 
		 * Puedes comprar cada libro como m�ximo una vez.
		 * complejidad O(n^2) 
		 * */
	public static int bookShop(int capacidad, int[] paginas, int[] costo) {
		int n=paginas.length;
		int[][] dp = new int[n+1][capacidad+1];
	    
		for(int i=1;i<=n;i++)
	    {
	        for(int j=0;j<=capacidad;j++)
	        {
	             
	            dp[i][j] = dp[i-1][j];
	            if(j >= costo[i-1])
	            {
	                dp[i][j] = Math.max (dp[i][j],dp[i-1][j-costo[i-1]] + paginas[i-1]);  
	            }
	        }
	    }
		return  dp[n][capacidad];
	}
		
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//caso prueba
		int p = scanner.nextInt();
		int cap = scanner.nextInt();
		int[] costo = new int[p];
		int[] pag = new int[p];
		for (int i = 0; i < p; i++) {
			costo[i] = scanner.nextInt();
			
		}
		for (int i = 0; i < p; i++) {
			
			pag[i] = scanner.nextInt();
		}
		System.out.println(bookShop(cap, pag, costo));
	    
	//caso prueba
		//int n=4,cap=10;
		//int [] costo= {4,8,5,3};
		//int[] pag= {5, 12 ,8,1 };
		//System.out.println("cantidad maxima de paginas:"+bookShop(cap, pag,costo));
		
	}
	
}


