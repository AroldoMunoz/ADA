package practica8;

public class MaxSquareEjercicio5 {
	//MaximalSquare
	/*
	 *Dada una matriz binaria m x n llena de ceros y unos,
	 *encuentre el cuadrado más grande que contenga solo unos y devuelva su área. 
	 * 
	 *relacion recurrencia
	 *si es un lateral o sea con coordenada 0 en i o j el valor de la matriz de esa coordenada es 1 si es '1' y 0 si es '0'
	 *otro caso el b(i,j)= el min{b(i,j-1),b(i-1,j), b(i-1,j-1)} +1 
	 *y a respuesta el el mayor mayor que tiene B al cuadrado, seria el area maxima encontrada 
	 * 
	 * */
	//complejidad O(nm)
	public static int maximalSquare(char[][] matrix) {
		int n,m;		
		n=matrix.length;
		m=matrix[0].length;
		int[][] B=new int[n][m];
		//en los laterales superior
		for(int i=0;i<n;i++) {
			if(matrix[i][0]=='1')
				B[i][0]=1;
			else
				B[i][0]=0;
		}
		//lateral isquierda
		for(int j=0;j<m;j++) {
			if(matrix[0][j]=='1')
				B[0][j]=1;
			else
				B[0][j]=0;
		}
		//otro caso b(i,j)= el min{b(i,j-1),b(i-1,j), b(i-1,j-1)} +1 
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(matrix[i][j]=='0')
					B[i][j]=0;
				else
					if(B[i-1][j-1]!=0)
						B[i][j]=(Math.min(Math.min(B[i][j-1],B[i-1][j]),B[i-1][j-1]))+1;
					else
						B[i][j]=1;
			}
		}
		//print(B);//imprime la matriz de los lados cuadrados
		return max(B);//retorna el max valor de la matriz
	}
	   
	private static int max(int[][]M) {
		int n,m;
		n=M.length;
		m=M[0].length;
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				max=Math.max(M[i][j],max);
			}
		}
		return max*max;//lateral x lateral = area
	}
	private static void print(int[][] array) {
		int n,m;
		n=array.length;
		m=array[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(array[i][j]+" ");	
		}
			System.out.println();
	}
}
	private static void print(char[][] array) {
		//imprime matrix char
		int n,m;
		n=array.length;
		m=array[0].length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(array[i][j]+" ");	
		}
			System.out.println();
	}
}
	
	public static void main(String []args){
		//casos prueba
		char[][] array={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},
				{'1','0','0','1','0'}} ;
		print(array);
		System.out.println("area maxima : "+maximalSquare(array));System.out.println();
		
		char[][] array1={{'0','1'},{'1','0'}} ;
		print(array1);
		System.out.println("area maxima : "+maximalSquare(array1));System.out.println();
		
		char[][] array2={{'0'}} ;
		print(array2);
		System.out.println("area maxima : "+maximalSquare(array2));System.out.println();
		
		char[][] arrayn={{'0','1','1','1','1'},{'1','1','1','1','1'},{'1','1','1','1','1'},
				{'1','1','1','1','0'}} ;
		print(arrayn);
		System.out.println("area maxima : "+maximalSquare(arrayn));System.out.println();
		
		
	}
}
