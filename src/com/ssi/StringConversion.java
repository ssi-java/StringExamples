package com.ssi;

public class StringConversion {
    public static void main(String[] args) {
        
        String s1="hello india";
        //lower case to upper case
        String s2=s1.toUpperCase();
        System.out.println(s2);
        //upper case to lower case
        String s3="INDORE";
        String s4=s3.toLowerCase();
        System.out.println(s4);
        //remove leading and trailing white spaces
        String s5="  hello user  ";
        String s6=s5.trim();
        System.out.println(s6);
        
    }
    
}
