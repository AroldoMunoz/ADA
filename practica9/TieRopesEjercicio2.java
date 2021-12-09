package practica9;
//ejercicio 2 Tie Ropes
/*
 * Hay N cuerdas numeradas de 0 a N - 1, cuyas longitudes se dan en una matriz A, 
 * colocadas en el suelo en una línea. Para cada I (0 ≤ I <N), 
 * la longitud de la cuerda I en la línea es A [I].
 * Decimos que dos cuerdas I e I + 1 son adyacentes . 
 * Se pueden atar dos cuerdas adyacentes con un nudo, 
 * y la longitud de la cuerda atada es la suma de las longitudes de ambas cuerdas. 
 * La nueva cuerda resultante se puede volver a atar.
 * Para un entero K dado, el objetivo es atar las cuerdas 
 * de tal manera que el número de cuerdas cuya longitud sea mayor o igual que K sea máximo.
 * 
 * Por ejemplo, considere K = 4 y la matriz A tal que:

    A [0] = 1  A [1] = 2    A [2] = 3   A [3] = 4
    A [4] = 1  A [5] = 1    A [6] = 3 
 * Después de eso, habrá tres cables cuyas longitudes sean mayores o iguales a K = 4. 
 * No es posible producir cuatro cables de este tipo.
 * la función debería devolver 3
 * */
public class TieRopesEjercicio2 {
	 public static int solution(int K, int[] A) {
		 
	        int n=A.length;
	        int cont=0,sum=0;
	        
	        for(int i=0; i<n; i++){
	            sum+= A[i];
	            if (sum >= K) {
	                cont++;
	                sum= 0;
	            }
	        }
	        return cont;
	    }
	 public static void main(String args[]) {
			//caso prueba
			int[] A= {1,2,3,4,1,1,3};
			int k=4;
			System.out.println("cantidad maxima :"+solution(k,A));
			
			int[] AA= {1,2,3,2,5,1,3,2,2};
			int kk=5;
			System.out.println("cantidad maxima :"+solution(kk,AA));
			
	 }
}