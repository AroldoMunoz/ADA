package practica6;
//encontrar el primer mayor o igual que x 
//complejidad O(log_2(n))  pues cada ves q entra al while hace una particion del arreglo en 2
public class PrimerMayor {
	public static int primerMayor( int [] arreglo, int dato) {
		 int inicio = 0;
		 int fin = arreglo.length - 1;
		 int pos;
		 while (inicio <= fin) {
			 pos = (inicio+fin) / 2;
		     if ( arreglo[pos] >= dato&& arreglo[pos-1] < dato )
		       return pos;
		     else if ( arreglo[pos] < dato ) {
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
		int numero=20;
		int[] array=list(numero);
		int n=primerMayor(array,15);
		if (n!=-1)
			System.out.println("el numero "+15+" su numero mayor o igual es "+array[n]);
		else
			System.out.println("no hay numero mayor");
		
		//caso prueba2
		int x=4;
		int[] array1= {1,2,5,6,7,9,11,14,18,21,22,30};
		//int[] array1= {2,3,5,6,8,10,12};
		int nn=primerMayor(array1,x);
		if (nn!=-1)
			System.out.println("el numero "+x+" su numero mayor o igual es "+array1[nn]);
		else
			System.out.println("no hay numero mayor");
		
		
		
	}

}
