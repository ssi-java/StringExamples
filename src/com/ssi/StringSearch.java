package com.ssi;

public class StringSearch {
    public static void main(String[] args) {
     
        //Demonstrating methods given for searching a character or string in the given string.
        
        String s="this is java code and java is powerful language";
        
        int idx1=s.indexOf('i');//searching for first occurrence of 'i' (i.e. 2)
        int idx2=s.indexOf('i',10);//searching for first occurrence of 'i' from index 10 (i.e.  27)
        int idx3=s.indexOf("java"); //searching for first occurrence of "java" (i.e.  8)
        int idx4=s.indexOf("java", 20);//searching for first occurrence of "java" fromm index 20 (i.e. 22)
        System.out.println(idx1);
        System.out.println(idx2);
        System.out.println(idx3);
        System.out.println(idx4);
        
    }
}
