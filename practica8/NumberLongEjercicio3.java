package practica8;

import java.util.Scanner;

public class NumberLongEjercicio3 {
	//ejercicio Number Long
	/* Dada una matriz de números enteros, 
	 * devuelve la longitud de la subsecuencia estrictamente creciente más larga.
	 * Una subsecuencia es una secuencia que se puede derivar de una matriz 
	 * eliminando algunos o ningún elemento sin cambiar el orden de los elementos restantes.
	 * 
	 * relacion recurrencia
	 * creamos un vector para buscar el maximo de cadenas crecientes para cada nums(i)
	 * 
	 *complejidad O(nlongn)) 	
	 *
	 */
	
    public static int lengthOfLIS(int[] nums) {

        int []aux=new int[nums.length];//aux toma valores maximos de cadena creciente
        aux[0]=1;
        for(int i=1;i<nums.length;i++){
            int cont=1;
            for(int j=0;j<i;j++){
            	//compara valores crecientes, si si es menor aumentara contador,
            	//y luego actualiza el auxiliar con el contador 
                if(nums[j]<nums[i]){
                    cont=Math.max(cont,aux[j]+1);
                }
                aux[i]=cont;
            }
        }
        //print(aux);
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=Math.max(aux[i],max);
        return max;
    }
	private static void print(int[] array) {
		int n;
		n=array.length;
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");	
		}
			System.out.println();
	
}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//caso prueba
	
	
		int n=4,cap=10;
		int [] array= {10,9,2,5,3,7,101,18};
		
		System.out.println("cantidad maxima secuencia es:"+lengthOfLIS(array));
		}   
}

