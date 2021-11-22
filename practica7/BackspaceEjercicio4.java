package practica7;
import java.util.*;

public class BackspaceEjercicio4 {
	/*ejercicio : back space usando cola doblemente enlazada deque
	 * 
	 * 
	 * complejidad O(n)
	 * */
		public static Deque backSpace(String array) {
			
			Deque dq=new LinkedList();
			int n = array.length();//n es tamaño arreglo
			char c;
			for (int i = 0; i<n; i++) {//recorre n veces
				c=array.charAt(i);
				if(c=='#') {
					dq.removeLast();
				}
				else 
					if (!(c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
						System.out.println("hay otros elementos diferentes al abecedario o el #");
						return null;
						}
					else
						dq.addLast(c);
				}
			return dq;
			}
		
		public static String imprimir(Deque deq) {
			String str="";
			while (!deq.isEmpty()) {
				str=str+deq.removeFirst();
			}
			return str;
		}	
	
		public static void main(String []args) {
			//caso prueba
			
			String arr  = "abc#de##f#ghi#jklmn#op#";
			String arr1 = "abcdefg";
			//String arr2 = "abcdefg$erdsf";
			
			System.out.println(arr+" cambia a :"+imprimir(backSpace(arr)));
			
			System.out.println(arr1+" cambia a :"+imprimir(backSpace(arr1)));
			
			
		 
		}
}
