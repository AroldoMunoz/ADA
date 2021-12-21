package practica11;

import java.util.*;
public class ejercicio1_anagram {
//public class Solution {
	//public List<List<String>> groupAnagrams(String[] strs) {
	public static List<List<String>> groupAnagrams(String[] str) {

         
		Map<String, List<String>> list = new HashMap<>();//crea un haspmap
		
        for (int i = 0; i < str.length; i++) {
		
            String temp = str[i];
            char[] chars = new char[temp.length()];
            temp.getChars(0, chars.length, chars, 0);//copiar String caracteres a una matriz de caracteres
            Arrays.sort(chars);//ordena el string alfabeticamente
            String key = new String(chars);//key es la palabra ordenada
            List<String> anagram = list.get(key);
            if(anagram == null){
                anagram = new ArrayList<>();
                list.put(key, anagram);
            }
            anagram.add(temp);
        }
        return new ArrayList<>(list.values());
    }


public static void main(String[] args) {
	//casos prueba
	String [] strs = {"eat","tea","tan","ate","nat","bat"};
	System.out.print(groupAnagrams(strs));
}
}
//}    

