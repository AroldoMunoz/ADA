package practica5;

public class pickResume {

	//what is the complexity
	public static String pickresume(String resumes) {
		String eliminate="top";
		
		while(resumes.length()>1) {// parte cada vez q entra en 2
			if (eliminate=="top"){//toma la cadena de la mitad hacia adelante
				resumes=resumes.substring(resumes.length()/2,resumes.length()-1);
				eliminate="bottom";
				}
			else {//toma la cadena de principio hasta el centro
				resumes=resumes.substring(0,resumes.length()/2);
				eliminate="top";
				}
		}
		return resumes;
		}
	//n tamaño del string a enviar
	//complejidad O(log_2(n))
		
		public static void main(String []args){
			//caso prueba
			
			String array= "abcdefgh";
			System.out.println(pickresume(array));
			//caso prueba2
			String array2= "pick123resume";
			System.out.println(pickresume(array2));
	}
}
