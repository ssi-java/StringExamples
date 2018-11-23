package com.ssi;

public class StringComparison {
    public static void main(String args[]){
        
        //equals method
        System.out.println("Checking-equals=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String s1=new String("indore");
        String s2=new String("indore");
        boolean b1=s1.equals(s2);
        System.out.println(b1);
        System.out.println("Checking-equalsIgnoreCase=>>>>>>>>>>>>>>>>>>>>>>>>");
        //equalsIgnoreCase
        String s3=new String("India");
        String s4=new String("india");
        boolean b2=s1.equals(s2);//will give false
        boolean b3=s1.equalsIgnoreCase(s2);//will give true
        System.out.println(b2);
        System.out.println(b3);
        //startsWith
        System.out.println("Checking-startsWith=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String s5="JavaProgram";
        boolean b5=s5.startsWith("Java");
        System.out.println(b5);
        //endsWith
        System.out.println("Checking-endsWith=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        boolean b6=s5.endsWith("Program");
        System.out.println(b6);
    }
}
