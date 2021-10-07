package practica1;

import java.util.*;
//poner espacios en cuadro de astericos con la palabra en el centro y ademas ingresar el
//espacio en consola
public class ejercicio6 {
	public static void main(String[] args) {
		
		//String palabra = "Hello word!";
		String palabra;
		int n,num,espacios;
		
		Scanner sc = new Scanner (System.in); 
		System.out.println("Ingrese la palabra: ");
		palabra=sc.next();
		
		n=palabra.length();
		System.out.println("Ingrese espacios: ");
		espacios=sc.nextInt();
		num=espacios*2+3;
		n=espacios*2+n;
		for(int i=0;i<num;i++) {
			if(i==0 ||i==num-1) {
				for(int j=0;j<n+2;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i==(num-1)/2){
				System.out.print("*");
				int j;
				for(j=0;j<espacios;j++) 
					System.out.print(" ");
				System.out.print(palabra);
				for(j=0;j<espacios;j++) 
					System.out.print(" ");
				
				System.out.println("*");
			}
			else//if(i==1||i==num-2) 
				{
				for(int j=0;j<n+2;j++) {
					if(j==0||j==n+1)
						System.out.print("*");
					else
					System.out.print(" ");
				}
				System.out.println();
			}
			
			}
		
	}

}
