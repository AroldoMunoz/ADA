package practica8;
import java.util.Scanner;
public class RectangleCuttingEjercicio4 {
	//ejercicio rectangle cutting
	/* Dado un a × brectángulo, su tarea es cortarlo en cuadrados. 
	 * En cada movimiento, puede seleccionar un rectángulo y cortarlo en dos rectángulos 
	 * de tal manera que todas las longitudes de los lados sigan siendo números enteros. 
	 * ¿Cuál es el número mínimo posible de movimientos?
	 * 
	 * relacion recurrencia
	 * seleccionar un rectángulo y cortarlo en dos rectángulos de los cuales 1 ya es cuadrado y 
	 * el otro procede a cortar de nuevo, hasta que sea un cuadrado o sea un rectangulo de grosor 1, 
	 * en este ultimo caso solo el valor maximo de los lados -1 se añande al contador
	 * 
	 *complejidad O(log_2(ab)) 
	 * */
	private static int rectangleCutt(int a, int b) {
		int cont = 0;
		int temp;
		//entra si es un rectangulo mayor a 1x1
		while(a+b>1) {
			if(a==b)
				return cont;
			if(Math.min(a, b)==1) {
				cont=cont+Math.abs(a-b);
				a=0;b=0;
			}
			else {//restamos el max menos el minimo de a,b en lo que resulta (max-min)x(min)el nuevo rectangulo
				temp=Math.min(a, b);
				b=Math.max(a, b)-temp;
				a=temp;
				cont++;
				}
		}
		return cont;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//casos prueba
		//int a=3,b=5;
		//int a=10,b=8;
		//int a=21,b=29;
		//int a=13,b=21;
		int a=21,b=28;
		System.out.println("cortes max de un rectangulo de "+a+" y "+b +" es :"+rectangleCutt(a,b));
	}
}
