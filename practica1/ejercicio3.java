package practica1;
//clasificar los numeros en pares e impares
public class ejercicio3 {
	
	public static void main(String[] args) {
	 	int arreglo[] = { 1,3,2,4,5,6,7 };
	 	int arrpar[]=new int[arreglo.length];
	 	int arrimpar[] = new int[arreglo.length];
	 	int p=0,q=0;
	 	
	 	for (int i=0; i<arreglo.length; i++) {
	 		if(arreglo[i]%2==0) {
	 			arrpar[p]=arreglo[i];
	 			p++;
	 		}
	 		else {
	 			arrimpar[q]=arreglo[i];
	 			q++;
	 			
	 		}
	 	}
	 		       
	 	System.out.print("Pares :");
	 	for (int i=0; i<p; i++) {
	    	System.out.print( arrpar[i]+" ");
	       
	    }
	 	System.out.println();
	 	System.out.print("Impares :");
	 	for (int i=0; i<q; i++) {
	    	System.out.print( arrimpar[i]+" ");
	       
	    }
	}

}
