package practica6;

public class EsCuadrado {
	public static int esCuadrado( int [] arreglo, int dato) {
		 int inicio = 0;
		 int fin = arreglo.length - 1;
		 int pos;
		 while (inicio <= fin) {
					 
		     pos = (inicio+fin) / 2;
		     if ( arreglo[pos]*arreglo[pos] == dato )
		       return pos;
		     else if ( arreglo[pos]*arreglo[pos] < dato ) {
		  inicio = pos+1;
		     } else {
		  fin = pos-1;
		     }
		 }
		 return -1;
		    }
	public static int[] list(int n) {//creacion de array de 1 hasta n
		int[] array= new int[n];
		for(int i=0;i<n; i++) {
			array[i]=i+1;
			
		}
		return array;
}
	public static void print(int[]list) {//imprime el array
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
		
	

	public static void main(String []args){
		//caso prueba
		int numero=16;
		int[] array=list(numero);
		int n=esCuadrado(array,numero);
		if (n!=-1)
		System.out.println("es cuadrado el numero "+numero +", su raiz es: "+array[n]);
		else
			System.out.println("no es cuadrado");
		
		int numero1=120;
		int[] array1=list(numero1);
		int nn=esCuadrado(array1,numero1);
		if (nn!=-1)
		System.out.println("es cuadrado el numero "+numero +", su raiz es: "+array1[n]);
		else
			System.out.println("no es cuadrado el numero: "+numero1);
		
		
		
	}

}
