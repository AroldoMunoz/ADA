package practica6;


//complejidad O(log_2(n))  pues cada ves q entra al while hace una particion del arreglo en 2
public class EsCuadrado {
	public static int esCuadrado( int dato) {
		 int inicio = 0;
		 int fin = dato;
		 int pos;
		 while (inicio <= fin) {
					 
		     pos = (inicio+fin) / 2;
		     if ( pos*pos == dato )
		       return pos;
		     else if ( pos*pos < dato ) {
		  inicio = pos+1;
		     } else {
		  fin = pos-1;
		     }
		 }
		 return -1;
		    }

	public static void print(int[]list) {//imprime el array
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
		
	public static void main(String []args){
		//caso prueba
		int numero=164;
		
		int n=esCuadrado(numero);
		if (n!=-1)
		System.out.println("es cuadrado el numero "+numero +", su raiz es: "+n);
		else
			System.out.println("no es cuadrado el numero "+numero);
		
		int numero1=121;
		
		int nn=esCuadrado(numero1);
		if (nn!=-1)
		System.out.println("es cuadrado el numero "+numero1 +", su raiz es: "+nn);
		else
			System.out.println("no es cuadrado el numero: "+numero1);
		
		
		
	}

}
