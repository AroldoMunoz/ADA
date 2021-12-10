package practica9;
import java.util.*;
public class BankQueueEjercicio3{
	//ejercicio 3 bank queue
	/*
	 * seleccionar a algunas personas en la cola, de modo que la cantidad total de efectivo almacenado 
	 * por estas personas sea lo más grande posible y ese dinero pueda trabajar para el banco 
	 * de la noche a la mañana.
	 * 
	 * La primera línea de entrada contiene dos números enteros. 
	 * N y T ,el número de personas en la cola y el tiempo en minutos hasta que Oliver cierra el banco. 
	 * Entonces sigue N líneas, cada una con 2 enteros ci y ti, que denota la cantidad de efectivo 
	 * en coronas suecas persona i tiene y el tiempo en minutos a partir de ahora después de qué persona 
	 * i se va si no se sirve. Tenga en cuenta que se tarda un minuto en atender a una persona y debe comenzar 
	 * a atender a una persona a la vez ti a más tardar. 
	 * */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T,N; 
		//caso prueba 1
		int [] ci= {1000,2000,500,1200}; 
		int[] ti= {1, 2 ,2,0 }; 
		T=4;
		//caso prueba 2 
		//int [] ci= {1000,2000,500}; 
		//int[] ti= {0,1,1}; 
		//T=4;
		N=ci.length;
                  
        /* 
       	N = in.nextInt();//para ingresar por consola
        T = in.nextInt();//para ingresar por consola
        */
		long totalCash = 0;
        long soFar = 0;
        //usando cola de prioridad, cantidad max tiene mayor prioridad
        PriorityQueue<Person> pq = new PriorityQueue<Person>(N, Collections.reverseOrder());
        
        for (int i = 0; i < N; i++) {
            //pq.add(new Person(in.nextInt(), in.nextInt()));//para ingresar por consola
            pq.add(new Person(ci[i],ti[i]));//para casos prueba
        }
        
        boolean[] select = new boolean[T];
        Person nextPerson;
        while (soFar < N && !pq.isEmpty()) {
            nextPerson = (Person)pq.poll();
            int start = nextPerson.time;
            //System.out.println("cola" +start+" "+select[start]); 
            
            while (start >= 0 && select[start]) {
                start--;
            }
           // System.out.println("colamodi" +start);
            if (start != -1) {
                soFar++;
                select[start] = true;
                //System.out.println("perso" +nextPerson.cash); 
                totalCash += nextPerson.cash;
            }
            //System.out.println("cash"+totalCash);
        }
        System.out.println(totalCash);  
    }
}

class Person implements Comparable<Person> {
    int cash;
    int time;
    
    public Person(int c, int t) {
        this.cash = c;
        this.time = t;
    }
    public int compareTo(Person p) {
        int pc = p.cash;
        int pt = p.time;
  
        if (cash < pc) return -1;
        if (cash > pc) return 1;
        if (time < pt) return -1;
        if (time > pt) return 1;
        return 0;
    }
}