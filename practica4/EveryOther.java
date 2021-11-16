package practica4;
//everyOther programa que suma a sus elementos el valor del indice par y muestra todos las
//listas posibles de sumas ejemplo lista {4,5,6,7} hay 4 elementos asi q habra 2 posibles 
// listas del indice 0 y 2 ;nos resulta para el indice 0 {4+4,5+4,6+4,7+4}={8,9,10,11}
//y para el indice 2 {4+6,5+6,6+6,7+6}={10,11,12,13}
public class EveryOther {
	public static void everyOther(int[] list) {
		int n=list.length;//n tamaño de la lista
		int[] aux = new int[n];// creando lista temporal o auxiliar
			
		for(int i=0;i< n; i++) {//n veces pasa
			// si el indice es par ,se suma a cada elemento de la lista 
			//su valor de la posicion del indice 
			if((i%2)==0) {
				for(int j=0;j<n;j++)//n veces pasa
					aux[j]=list[j]+list[i];
				print(aux);
			}
		}
	}
	//complejidad n x n o sea O(n^2)
	//imprime la lista  de elementos
	public static void print(int[]list) {
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String []args){
		// caso prueba
		//int[]lista= {4,5,6,7};
		int[] lista= {1,2,3,4,6,8};
		
		print(lista);// mostrando la lista
		System.out.println();
		everyOther(lista);
	}

}
