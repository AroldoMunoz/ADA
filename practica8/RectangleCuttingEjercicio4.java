package practica8;
import java.util.Scanner;
public class RectangleCuttingEjercicio4 {
	//ejercicio rectangle cutting
	/* Dado un a × brectángulo, su tarea es cortarlo en cuadrados. 
	 * En cada movimiento, puede seleccionar un rectángulo y cortarlo en dos rectángulos 
	 * de tal manera que todas las longitudes de los lados sigan siendo números enteros. 
	 * ¿Cuál es el número mínimo posible de movimientos?
	 * 
	 */
	private static int rectangleCutt(int a, int b) {
		int cont = 0;
		int temp;
		int[][] dp = new int[a+1][b+1];
		//entra si es un rectangulo mayor a 1x1
		for (int i = 0; i <= a; i++) {
		    for (int j = 0; j <= b; j++) {
		      if (i == j) {
		    	  dp[i][j] = 0;
		      } else {
		    	  dp[i][j] = a *b;
		    	  for (int k = 1; k < i; k++) {
		    		  dp[i][j] = Math.min(dp[i][j], dp[k][j]+dp[i-k][j]+1);
		    	  }
		    	  for (int k = 1; k < j; k++) {
		    		  dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[i][j-k]+1);
		    	  }
		      }
		    }
		}
		return dp[a][b];
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//casos prueba
		//int a=3,b=5;
		//int a=10,b=8;
		//int a=21,b=29;
		//int a=13,b=21;
		//int a=21,b=28;
		//System.out.println("cortes max de un rectangulo de "+a+" y "+b +" es :"+rectangleCutt(a,b));
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		//System.out.println("cortes max de un rectangulo de "+a+" y "+b +" es :"+rectangleCutt(a,b));
		System.out.println(rectangleCutt(a,b));
	}
}
