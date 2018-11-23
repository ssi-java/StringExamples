package com.ssi;
public class StringParts {
    public static void main(String[] args) {
        System.out.println("Checking substring 1 args==>>");
        String s1="this is java code";
        String s2=s1.substring(8);
        System.out.println(s2);
        System.out.println("Checking substring 2 args==>>");
        String s3=s1.substring(8,12);
        System.out.println(s3);
        System.out.println("Checking replace==>>");
        String s4=s1.replace('i', 'e');
        System.out.println(s4);
        System.out.println("Checking concat==>>");
        String s5="SSI";
        String s6="INDORE";
        String s7=s5.concat(s6);
        System.out.println(s7);
        System.out.println("Checking split==>>");
        String s8="indore-bhopal-delhi-chennai";
        String cities[]=s8.split("-");
        for(String city:cities){
        System.out.println(city);
        }
        
    }
}
