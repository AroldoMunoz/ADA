package practica4;
//funcion twosum que entra un array y verifica si hay 2 numeros que sumados hacen 10
public class TwoSum {
	
	public static boolean twoSum(int[] list) {
		for(int i=0;i< list.length-1; i++) {//n veces
			for(int j=0;j<list.length-1;j++){// n veces
				//suma 2 numeros de la lista sin sumar el mismo numero bota true si halla
				//si no encuentra retorna false
				if(i!=j && list[i]+list[j]==10) {
					System.out.println("Exixte 2 numeros q sumados resulta 10 ");
					System.out.println("los numeros "+list[i]+" y "+list[j]);
					return true;
				}
				}
			//recorre 2 veces por los 2 for n veces	
		}
		System.out.println("No exixte 2 numeros q sumados resulta 10");
	return false;
		
	}
	// complejidad O(n^2)
	
	public static void main(String []args){
		//caso prueba
		int[] array= {4,8,50,20,6,15,16};
		 twoSum(array);
		 int[] array2= {1,2,3,4,5,10,11,16};
		 twoSum(array2);
	}
}
