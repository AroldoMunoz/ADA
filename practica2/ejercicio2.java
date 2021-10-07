package practica2;
import java.util.Scanner;
//search buscando un elemento de un arreglo
//printArr imprimir arreglos
//metodo insertionsort ordena el array
public class ejercicio2 {

	public static int[] crearArray(int num) {
		int arr[]=new int[num];
		int temp=num;
		for(int i=0;i<num;i++) {
			arr[i]=temp;
			temp--;
				
		}
		return arr;
	}
	


	public static boolean search(int[] array,int num) {
		for(int i=0;i<array.length;i++) {
			if (array[i]==num)
				return true;
		}
		return false;
	}
	public static void printArr(int [] A) {
		int i;
		for(i=0;i<A.length-1;i++)
			System.out.print(A[i]+" , ");
		System.out.println(A[i]);
		}
	
	
	public static int[] insertionSort(int[] Array) {
	
		int i,key;
		for(int j=1;j<Array.length;j++) {
			key=Array[j];
			i=j-1;
			while (i>=0 && Array[i]>key) {
				Array[i+1]=Array[i];
				i=i-1;
			}
			Array[i+1]=key;
		}
	return Array;	
	}
	
	
	public static void main(String[]args) {
		
		int[] arreglo= {10,11,15,21,5,500,25};
		System.out.println(search(arreglo,20));
		
		int[] arreglo1=insertionSort(arreglo);
		 printArr(arreglo1);
		  
		
		int[] array=crearArray(10000000);	
		//printArr(array);
		double inicio=System.nanoTime();
		System.out.println(search(array,1));
		double fin=System.nanoTime();
		System.out.println("Tiempo de ejecución en nanosegundos: " + (fin-inicio));
		 }
		
		
	}


