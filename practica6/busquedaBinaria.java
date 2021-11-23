package practica6;
//busqueda binaria basica
//complejidad log_2(n)
public class busquedaBinaria {
	public static int busBinaria( int [] arreglo, int dato) {
		 int inicio = 0;
		 int fin = arreglo.length - 1;
		 int pos;
		 while (inicio <= fin) {
					 
		     pos = (inicio+fin) / 2;
		     if ( arreglo[pos]== dato )
		       return pos;
		     else if ( arreglo[pos] < dato ) {
		  inicio = pos+1;
		     } else {
		  fin = pos-1;
		     }
		 }
		 return -1;
		    }
	public static int[] list(int n) {
		int[] array= new int[n];
		for(int i=0;i<n; i++) {
			array[i]=i+1;
			
		}
		return array;
}
	public static void print(int[]list) {
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
		


	public static void main(String []args){
		//caso prueba
		int[] array= {1,2,3,4,5,6,7,8,9};
		int numero=4;
		int n;
		n=busBinaria(array,numero);
		if (n!=-1)
			System.out.println(array[n]+" se encontro en el arreglo");
		else
			System.out.println(numero+" no esta en el arreglo");
			
	//caso prueba 2
		int[] array1= {4,5,8,10,15,22,30,45,50};
		int numero1=16;
		int nn;
		nn=busBinaria(array1,numero1);
		if (nn!=-1)
			System.out.println(array[nn]+" se encontro en el arreglo");
		else
			System.out.println(numero1+" no esta en el arreglo");
		}

}
