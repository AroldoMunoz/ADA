package practica5;

public class ejercicio2 {
	//q2:what is the time complexity of
	//A2: complejidad O(n)
		//imprime los valores de la lista pero inversamente
		public static void printinv(int[]list) {
			for(int i=list.length-1;i>=0;i--) { //n+1
				System.out.print(list[i]+" "); //n
			}
			System.out.println();
		}
		public static void main(String []args){
			
			int[] array= {4,8,50,20,6,15,16};
			
			printinv(array);
			
			
		}

}
