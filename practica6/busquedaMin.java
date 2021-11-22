package practica6;
//encontrar menor elemento de un array ordenado rotado 
//complejidad O(log_2(n))  pues cada ves q entra al while hace una particion del arreglo en 2
public class busquedaMin {
	public static int minimo( int [] arreglo) {
		 int inicio = 0;
		 int fin = arreglo.length - 1;
		 int pos,dato;
		 while (inicio <= fin) {
			 pos = (inicio+fin) / 2;
		     dato=arreglo[pos];
		     if ( arreglo[inicio] < dato &&dato<arreglo[fin] )
		       return arreglo[inicio];
		     else if ( arreglo[inicio] >= dato ) {
		    	 fin = pos;
		    	  	} else {
		     	inicio = pos;
		     	  	}
		        
		     if ( inicio==fin) {
				 return arreglo[inicio+1];
			 }
		 }
		 return -1;
		    }
	
	public static void main(String []args){
		//caso prueba
		int[] arra= {6,7,9,15,19,2,3};
		int a=minimo(arra);
		if (a!=-1)
		System.out.println("el numero menor es: "+a);
		else
			System.out.println("-1");
		//caso 2
		int[] array= {7,8,9,10,1,2,3,4,5,6};
		
		int n=minimo(array);
		if (n!=-1)
		System.out.println("el numero menor es: "+n);
		else
			System.out.println("-1");
		
	}

}
