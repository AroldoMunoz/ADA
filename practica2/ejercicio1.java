package practica2;

import java.util.Scanner;
//ingresar n y k (n numero de datos, k divisible) y mostrar cuantos  numeros
// son divisible por k
public class ejercicio1 {
	public static void main(String[] args) {
		
		int n,k,cont=0;
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Ingrese n y k: ");
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int[n];
		//ingreso de datos
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//contando datos divisibles por k
		for(int j=0;j<n;j++) {
			if(arr[j]%k==0)
				cont++;
		
			}
		
		System.out.println(cont);
	}
}
