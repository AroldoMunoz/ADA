package practica1;
//poner espacios en cuadro de astericos con la palabra en el centro
public class ejercicio5 {
	
	public static void main(String[] args) {
		
		String palabra = "Hello word!";
		int n=palabra.length();
		
		for(int i=0;i<5;i++) {
			if(i==0 ||i==4) {
				for(int j=0;j<n+4;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i==1||i==3) {
				for(int j=0;j<n+4;j++) {
					if(j==0||j==n+3)
						System.out.print("*");
					else
					System.out.print(" ");
				}
				System.out.println();
			}
			if(i==2)
					System.out.println("* "+palabra+" *");
					
			}
		
	}
}

