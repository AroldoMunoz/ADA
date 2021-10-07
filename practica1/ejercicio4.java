package practica1;
//ordenar el arreglo en forma ascendente
public class ejercicio4 {
	public static  void burbuja(int[] A) {
        int i,j,aux;
        for (i=0;i<A.length-1;i++) {
            for (j=0;j<A.length-i-1;j++) {
                if (A[j+1] < A[j]) {
                    aux = A[j+1];
                    A[j+1] = A[j];
                    A[j] = aux;
                }
            }
        }
        
	}
	
	public static void main(String[] args) {
		
		int arreglo[] = { 9,5,8};
		
		burbuja(arreglo);
		
		for (int i=0; i<arreglo.length; i++) 
			System.out.print( arreglo[i]+" ");
		
				
	}

}
