package practica5;

public class ejercicio3 {

	//Q3:what is the time complexity of
		//A3:complejidad O(n)
			//imprime solo los indices par
			public static void posiPar(int[]list) {
				for(int i=0;i<list.length;i=i+2) { //n+1
					System.out.print(list[i]+" "); //n
				}
				System.out.println();
			}
			
			public static void main(String []args){
				
				int[] array2= {1,2,3,4,5,10,11,16};
				
				posiPar(array2);
				
				
			}
}
