package practica7;

import java.util.*;

public class InterWaitEjercicio5 {
	/*interview wait
	 *imput {4,-1,5,2,3}  output 9 (3+2+4=9)
	 * 
	 * complejidad O(n)
	*/
	public static int interWait(int[] array) {
		int n = array.length;//n es tamaño arreglo
		Deque <Integer>dq=new LinkedList();
		int cont=0;//contador de tiempo de espera
		
		for (int i = 0; i<n; i++) {
			dq.add(array[i]); //agregando elementos del array en un deque
		}
		for (int i = 0; i<n; i++) {//recorre n vecesa lo mucho
			//busca extremos si halla -1 termina y devuelve cont
			if(dq.getFirst()==-1 || dq.getLast()==-1) {
				return cont;
			}
			//suma el elemento menor extreno
			if(dq.getFirst()<=dq.getLast()) {
				cont=cont+dq.removeFirst();
			}
			else
				cont=cont+dq.removeLast();
		}
		return -1;
	}
	
	
	public static void main(String []args) throws Exception{
		//caso prueba
		
		int arr[] ={ 4,-1,5,2,3};
		int arr1[] ={ 1,2,3,4,5,-1,2,1,4};
		int arr2[] ={ 10,6,9,3,11,17,5,-1,4};
		
		
		System.out.println(interWait(arr));
		System.out.println(interWait(arr1));
		System.out.println(interWait(arr2));
	
		 
}

	
}
