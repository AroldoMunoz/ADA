package practica3;

public class ejercicio1 {
	
	public static boolean busquedaBinaria(int  vector[], int dato){
		
		  int centro,inf=0,sup=vector.length-1;
		  while(inf<=sup){
			  centro=(sup+inf)/2;
			  if(vector[centro]==dato) return true;
			  else 
				  if(dato < vector [centro] ){
				  sup=centro-1;
				  }
				  else {
					  inf=centro+1;
				  }
		   	}
		  return false;
	}
	public static int[] crearArray(int num) {
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=i+1;
		}
		return arr;
	}
	public static void printArr(int [] A) {
		int i;
		for(i=0;i<A.length-1;i++)
			System.out.print(A[i]+" , ");
		System.out.println(A[i]);
		}
	

	public static void main(String []args){
		int[]vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
		int valorBuscado = 70;
		  
		System.out.println(busquedaBinaria(vector,valorBuscado));
		
		int n=10000000;	
		int[] array=crearArray(n);	
		//printArr(array);
		double inicio=System.nanoTime();
		System.out.println(busquedaBinaria(array,n-1));
		double fin=System.nanoTime();
		System.out.println("Tiempo de ejecución en nanosegundos: " + (fin-inicio));
		}

}
