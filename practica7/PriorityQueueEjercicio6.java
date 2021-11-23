package practica7;

import java.util.*;

public class PriorityQueueEjercicio6 {
	/*Priority queue
	 *imput {{1,4,5},{1,3,4},{2,6}} output [1,1,2,3,4,4,5,6]
	 * 
	 * complejidad O(n^2)
	*/
	public static String prioryQ(int[][] arr) {
		
		PriorityQueue pq=new PriorityQueue();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				pq.add(arr[i][j]);
			}
		}
		String sc="[";
		while(pq.peek()!=null) {
			sc=sc+pq.poll()+",";
		}
		sc=sc+"]";
		return sc;
		
	}
	
	public static void main(String []args){
		//caso prueba
		
		int arr[][] = {{1,4,5},{1,3,4},{2,6}};
		
		System.out.println(prioryQ(arr));
		
	
		 
}

	
}