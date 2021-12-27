package practica11;
import java.util.Scanner;
/*
*Un borde de una cadena es un prefijo que también es un sufijo de la cadena, 
*pero no la cadena completa. Por ejemplo, los bordes de abcababcabson aby abcab.
*Su tarea es encontrar todas las longitudes de los bordes de una cadena determinada.
*/
//caso prueba "abcababcab" nos bota "2 5 "
public class ejercicio4_findingBorder {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      
        String temp1="",temp2="";
        String str = sc.nextLine();
        int n=str.length();
        
                      
        for(int i=0;i<n-1;i++) {
        	temp1=temp1+str.charAt(i);
        	temp2=str.charAt(n-1-i)+temp2;
        	//System.out.println(temp1+" "+temp2);
        	if(temp1.equals(temp2)) {
        		System.out.print((i+1)+" ");
        	}
        }
       		
        	
    }
}

