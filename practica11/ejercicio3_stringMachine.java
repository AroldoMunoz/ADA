package practica11;
/*
 * ejercicio stringMachine coincidencias de cadenas
 * la entrada consta de varios casos de prueba. 
 * Cada caso de prueba consta de dos líneas, primero un patrón no vacío y luego un texto no vacío . 
 * La entrada finaliza al final del archivo. 
 * */
//casos prueba "stringb"   "stringa"   da resultado   "indice de coincidencia"
//"p" 	  	 "Popup"		  "2 4" 
//"helo"	 "Hello there!" 	 ""
//"peek a boo"  "you speek a bootiful language" "5" 
//"anas" 	"bananananaspaj"	 "7" 

import java.util.*;

public class ejercicio3_stringMachine {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        String temp;
        while (sc.hasNextLine()) {
        	temp="";
            String b = sc.nextLine();
            String a = sc.nextLine();
            int[] lps = getLPS(b);
            int i = 0, j = 0;
            while (i < a.length()) {
                if (a.charAt(i) == b.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == b.length()) {
                    ans.append(i - j).append(' ');
                    temp=temp+(i - j)+" ";//si encuentra se agrega el indice inicial
                    j = lps[j - 1];
                } else if (i < a.length() && a.charAt(i) != b.charAt(j)) {
                    if (j > 0)
                        j = lps[j - 1];
                    else
                        i++;
                }
            }
            ans.append('\n');
           System.out.println(temp);// solo nuestra el actual comparando 2 para probar manualmente uno por uno
        }
        System.out.println(ans);// agrega cada resultado en lineas separadas para probar en pag
    }

    static int[] getLPS(String b) {
        int[] arr = new int[b.length()];
        int x = 1, len = 0;
        while (x < b.length()) {
            if (b.charAt(x) == b.charAt(len)) {
                arr[x++] = ++len;
            } else {
                if (len > 0)
                    len = arr[len - 1];
                else
                    arr[x++] = len;
            }
        }
        return arr;
    }
}

