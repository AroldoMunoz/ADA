package practica7;

import java.util.Stack;

public class RPNejercicio1 {
	/*reverse polish notation
	 * "2 3 +" instead of "2+3"
	 * vvalido los operadores +,-,*,/
	 * each operand may be an integer or another expression
	 * 
	 * 
	 * complejidad O(n)
	*/
	public static int polish(String[] array) {
		int n = array.length;//n es tamaño arreglo
		Stack <Integer> pila=new Stack<Integer>();
		int temp,aux;
		
		for (int i = 0; i<n; i++) {//recorre n veces
			switch(array[i]) {
				case "+":
					temp=pila.peek();//toma el valor de la cima
					pila.pop();		//elimina la cima
					aux=pila.peek();//toma el valor de la cima
					pila.pop();//elimina la cima
					pila.push(temp+aux);//hace la operacion y pone en la pila el resultado
					break;
				case "-":
					temp=pila.peek();
					pila.pop();
					aux=pila.peek();
					pila.pop();
					pila.push(temp-aux);
					break;
				case "*":
					temp=pila.peek();
					pila.pop();
					aux=pila.peek();
					pila.pop();
					pila.push(temp*aux);
					break;
				case "/":
					temp=pila.peek();
					pila.pop();
					aux=pila.peek();
					pila.pop();
					if(temp==0) {
						System.out.println("no se puede dividir entre 0");
						return -1;
					}
					pila.push(aux/temp);
					break;
				default:
					if(array[i].matches("[+-]?\\d*(\\.\\d+)?")) //verificacion si es un numero
					pila.push(Integer.parseInt(array[i]));// el string lo transforma a numero
					else {
					System.out.println("se encontro un elementoque no es numero ni los simbolos + - * / ");
					}
			}
		}
		return pila.peek();
	}
	
	
	public static void main(String []args) throws Exception{
		//caso prueba
		
		String arr[] ={ "2","1","+","3","*"};
		String arr1[] ={ "4","13","5","/","+"};
		String arr2[] ={ "10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		
		System.out.println(polish(arr));
		System.out.println(polish(arr1));
		System.out.println(polish(arr2));
	
		 
}

	
}
