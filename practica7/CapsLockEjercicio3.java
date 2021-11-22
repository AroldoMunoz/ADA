package practica7;
import java.util.*;

public class CapsLockEjercicio3 {
	/*ejercicio : caps lock
	 * 
	 * 
	 * complejidad O(n^2)
	 * */
		public static String capsLock(String array) {
			
			Queue cola=new LinkedList();
			int n = array.length();//n es tamaño arreglo
			String cadena="";
			boolean estaMinus=true;
			char c;
			for (int i = 0; i<n; i++) {//recorre n veces
				switch(array.charAt(i)) {
					case '$'://vacia la cola
						while(!cola.isEmpty()) {
							if(estaMinus) //si iesta minuscula solo concatena al strign
								cadena=cadena+cola.remove();
							else 
								//si esta mayuscula, tranformamos la cola en mayuscula cada elemento
								//y lo concatenamos
								cadena=cadena+Character.toUpperCase((char) cola.remove());
						}
						break;
					case '@':
						if(estaMinus)
							estaMinus=false;
						else
							estaMinus=true;
						break;
					default:
						c=array.charAt(i);
						if (!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
							return "hay otros elementos diferentes al abecedario o el $ y @";}
						else
							cola.add(array.charAt(i));
						
				}
			}
			
			return cadena;
		}
		
		
		public static void main(String []args) {
			//caso prueba
			
			String arr  = "abc$d@ef$@g$";
			String arr1 = "abcdefg";
			String arr2 = "abcdefg$erdsf";
			
			
			System.out.println(arr+" cambia a :"+capsLock(arr));
			//al no tener $ no muestra pero la cola estan los elementos
			System.out.println(arr1+" cambia a :"+capsLock(arr1));
			
			System.out.println(arr2+" cambia a :"+capsLock(arr2));
		 
		}
}
