package practica4;
//ejercicio de buscar el numero mayor de una lista de un array
public class GreatesNumber {
	public static int greateNumber(int[] list) {
		//max es el 1er numero
		int max=list[0];
		//el ciclo ira desde el elemento 2 hasta tamaño del arreglo
		for(int i=1;i< list.length-1; i++) { //hace n veces
			//si el numero de la lista es mayor, este valor se pasa al max
			if(max<list[i])
				max=list[i];
		}
	return max;
		
	}
	//complejidad O(n)
	
	public static void main(String []args){
		
		//casos prueba
		int[] array= {4,3,50,20,36,15,16};
		System.out.println("el mayor numero es: "+ greateNumber(array));
		int[] array2= {-14,-21,-4,-8,-1,-10,-16};
		System.out.println("el mayor numero es: "+ greateNumber(array2));
		
	}
	

}
