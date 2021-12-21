package practica9;

import java.util.Scanner;

public class AViciousPikemanEjercicio4 {
	
    public static void quickSort(int vec[], int inicio, int fin){
        if(inicio>=fin) return;
        int pivote=vec[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
                while(elemIzq<=fin && vec[elemIzq]<pivote){
                        elemIzq++;
                }
                while(elemDer>inicio && vec[elemDer]>=pivote){
                        elemDer--;
                }
                if(elemIzq<elemDer){
                        int temp=vec[elemIzq];
                        vec[elemIzq]=vec[elemDer];
                        vec[elemDer]=temp;
                }
        }
        
        if(elemDer>inicio){
                int temp=vec[inicio];
                vec[inicio]=vec[elemDer];
                vec[elemDer]=temp;
        }
        quickSort(vec, inicio, elemDer-1);
        quickSort(vec, elemDer+1, fin);
}
	public static String AVicious(int [] A)	{
		int probs, mins, a, b, c, t, tiempoTotal, penalidad, soluciona;
		probs=A[0]; mins=A[1];a=A[2];b=A[3];c=A[4];t=A[5];
		
		int[] tiempoSol=new int[probs];
		tiempoSol[0] = t;
		for(int i=1; i<probs; i++){
			tiempoSol[i] = (((a*tiempoSol[i-1])+b)%c)+1;
		}
		quickSort(tiempoSol,0,probs-1);
		tiempoTotal = 0;
		soluciona = 0;
		penalidad = 0;
		for(int i=0; i<probs; i++){
			
			if(tiempoSol[i] + tiempoTotal <= mins){
				tiempoTotal += tiempoSol[i];
				penalidad += tiempoTotal;
				soluciona++;
			} else break;
		}
		return soluciona+" "+ penalidad;
		
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		//por consola
		/*int[] A = new int[6];
		for (int i = 0; i < 6; i++) 
			A[i] = scanner.nextInt();
		*/		
		//caso prueba
		int [] A= {1,3,2,2,2,1};
		System.out.println(AVicious(A));
		
		//int[] B= {2, 10 ,2,2,2,2};
		//System.out.println(AVicious(B));
		
	}

}
