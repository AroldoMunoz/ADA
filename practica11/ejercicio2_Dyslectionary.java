package practica11;
import java.io.*;
import java.util.*;

public class ejercicio2_Dyslectionary {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input,inv;
        boolean finished = false;
        while ((input = reader.readLine()) != null) {
            List<String> dictionary = new ArrayList<>();
            int maxLength = 0;
            
            while (true) {
            	inv="";
                if (input == null) {
                    finished = true;
                    break;
                }
                if (input.isEmpty()) {
                    break;
                }
                //invertimos el string
                for (int i = input.length() - 1; i >= 0; i--) {
            		inv += input.charAt(i);
            	}
                dictionary.add(inv);//agregamos el string invertido
                if (input.length() > maxLength) {
                    maxLength = input.length();
                }
                input = reader.readLine();
            }
            Collections.sort(dictionary);//ordena el dicionario
            //en el siguiente for agregamoslos espacios e invertimos el dicionario anterios para cada string
            for(int i=0;i<dictionary.size();i++) {
            	inv="";
            	for (int p =0;p<maxLength ;p++) {
            		if(p+dictionary.get(i).length()<maxLength) {
            			inv=inv+" ";
            		}else
            			inv =inv+ dictionary.get(i).charAt(maxLength-p-1);
            		}
            	dictionary.set(i, inv);
            }
                      
            for (String word : dictionary) {
                System.out.println(word);
            }
            if (!finished) {
                System.out.println("");
            }
        }
    }
}