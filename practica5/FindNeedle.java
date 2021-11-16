package practica5;

public class FindNeedle {
	
//programa que dice si esta needle dentro de la cadena de haystack
	//ejempo "fgh" esta en "abcdefgh"  , es verdad
	//tamaño de needle=n y haystack en m
	
	public static boolean findNeedle(String needle,String haystack) {
		int needleindex=0;
		int haystackindex=0;
		boolean found_needle=false;
		
		while(haystackindex<haystack.length()) {//m veces pasa
			if (needle.charAt(needleindex)==haystack.charAt(haystackindex)){
				 found_needle = true;
				 while(needleindex<needle.length()) {//n veces pasa
					 if (needle.charAt(needleindex)!= haystack.charAt(haystackindex+needleindex)) {
						 found_needle=false;
						 break;
					 }
				 needleindex +=1;
				
				 if(needleindex==needle.length()) 
					 return true; 
				 }
				 if (!found_needle) 
					 needleindex =0;
			}
			haystackindex +=1;
		}
		return false;
		}
	//complejidad mxn o sea O (mn)
		
		public static void main(String []args){
			//caso prueba
			
			String array= "abcdefgh";
			String pal= "fgh";
			if(findNeedle(pal,array)) 
				System.out.println("hay la palabra");
			else
				System.out.println("no hay la palabra");
			//caso prueba2
			array= "abcdefghijkl";
			pal= "fghj";
			if(findNeedle(pal,array)) 
				System.out.println("hay la palabra");
			else
				System.out.println("no hay la palabra");
				
			 
	}
		

}
