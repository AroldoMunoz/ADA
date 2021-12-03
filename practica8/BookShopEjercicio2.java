package practica8;
import java.util.Scanner;
public class BookShopEjercicio2 {
	//ejercicio boos shop
	/*Estás en una librería que vende n libros diferentes. 
	 * Sabes el precio y el número de páginas de cada libro.
	 * Ha decidido que el precio total de sus compras será como máximo x. 
	 * ¿Cuál es el número máximo de páginas que puede comprar? 
	 * Puedes comprar cada libro como máximo una vez.
	 * complejidad O(n^2) 
	 * */
	private static int bookShop(int capacidad, int[] paginas, int[] costo) {
		int cantidad = 0;
		int index;
		while(capacidad>0) {
			index = getMaxIndex(costo, paginas);
			if(costo[index]==0||paginas[index]==0)
				break;
			//visita pagina con mayor pagina , lo agrega a cantidad 
			if (capacidad> costo[index]) {
				cantidad=cantidad+paginas[index];
				capacidad=capacidad-costo[index];
			}
			//elimina el index actual
			costo[index]=0;
			paginas[index]=0;
		}
		return cantidad;
	}
	//busca el indice con mayor valor, es decir el mayor valor de pag(i)/costo(i)
	public static int getMaxIndex(int[] costo, int[] pag) {
        int max_i = 0;
        double max = 0;
        for (int i = 0; i < costo.length; i++) {
            if (costo[i] != 0 && (double) pag[i] / costo[i] > max) {
                max = (double) pag[i] / costo[i];
                max_i = i;
            }
        }
        return max_i;
    }

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//caso prueba
		/*int p = scanner.nextInt();
		int cap = scanner.nextInt();
		int[] costo = new int[p];
		int[] pag = new int[p];
		for (int i = 0; i < p; i++) {
			costo[i] = scanner.nextInt();
			pag[i] = scanner.nextInt();
		}
		System.out.println(bookShop(cap, pag, costo));
	    */
	
		int n=4,cap=10;
		int [] costo= {4,8,5,3};
		int[] pag= {5, 12 ,8,1 };
		System.out.println("cantidad maxima de paginas:"+bookShop(cap, pag,costo));
		
	}
	
}


