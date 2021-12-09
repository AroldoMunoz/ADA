package practica9;

import java.util.Scanner;
//ejercicio 1 MaxNonoverlappingSegments
/*
* Ubicados en una línea hay N segmentos, numerados de 0 a N - 1, 
* cuyas posiciones se dan en las matrices A y B. Para cada I (0 ≤ I <N) 
* la posición del segmento I es de A [I] a B [ I] (inclusive). 
* Los segmentos están ordenados por sus extremos, lo que significa que B [K] ≤ B [K + 1] 
* para K tal que 0 ≤ K <N - 1.
* Por ejemplo, considere las matrices A, B tales que:
  A [0] = 1 B [0] = 5
  A [1] = 3 B [1] = 6
  A [2] = 7 B [2] = 8
  A [3] = 9 B [3] = 9
  A [4] = 9 B [4] = 10
* 	El tamaño de un conjunto no superpuesto que contiene un número máximo de segmentos es 3.
* Por ejemplo, los conjuntos posibles son {0, 2, 3}, {0, 2, 4}, {1, 2, 3} o {1, 2, 4}. 
* No hay un conjunto no superpuesto con cuatro segmentos.
*/

public class MaxNonoverlappingSegmentsEjercicio1 {
	 public static int solution(int A[], int B[]) {
		 int max = 1;
		 int temp = B[0];
		 int n = A.length;
		 if (n <= 1) 
			 return n;
		 for (int i = 1; i < n; i++) {
			 if (A[i] > temp) {
				 max++;
				 temp = B[i];
			 }
		 }
		 return max;
	 }
	  public static void main(String args[]) {
			
			//caso prueba
					
			int[] A= {1,3,7,9,9};
			int[] B= {5,6,8,9,10};
			System.out.println("cantidad maxima :"+solution(A,B));
			
			int[] AA= {1,2,5,8,9};
			int[] BB= {5,6,7,9,10};
			System.out.println("cantidad maxima :"+solution(AA,BB));
			
		}
}
