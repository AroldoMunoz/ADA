package practica5;

public class ejercicio1 {
//q1 :what complexity of
//A1:complejidad o(n)
	//imprime los valores de la lista
	public static void print(int[]list) {
		for(int i=0;i<list.length;i++) {//n+1
			System.out.print(list[i]+" ");//n
		}
		System.out.println();
	}


	public static void main(String []args){
		
		int[] array= {4,8,50,20,6,15,16};
		int[] array2= {1,2,3,4,5,10,11,16};
		print(array);
		
		
	}
	
}
