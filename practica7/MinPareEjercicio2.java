package practica7;
import java.util.Stack;
public class MinPareEjercicio2 {
	/*ejercicio 2: minimun add to make parentheses valid
	 * 
	 * busca el tamaño de la pilacon parentesis  no validados
	 * complejidad O(n)
	 * */
		public static int minParentesis(String array) {
			
			Stack <String> pila=new Stack<String>();
			int n = array.length();//n es tamaño arreglo
			int count=0;
			for (int i = 0; i<n; i++) {//recorre n veces
				switch(array.charAt(i)) {
					case '(':
						pila.push("(");
						count++;
						break;
					case ')':
						if ( !pila.empty()) {
							if(pila.peek()=="(") {
								pila.pop();
								count--;
								break;
							}
						}
						pila.push(")");
						count++;
						break;
					default:
						System.out.println("hay elemento diferente a '(' y ')' ");
				}
			}
			return count;
		}
		
		
		public static void main(String []args) {
			//caso prueba
			
			String arr  = "())";
			String arr1 = "(((";
			String arr2 = "(()))(";
			String arr3 = "()))((";
			
			System.out.println(minParentesis(arr));
			System.out.println(minParentesis(arr1));
			System.out.println(minParentesis(arr2));
			System.out.println(minParentesis(arr3));
		 
		}
}
