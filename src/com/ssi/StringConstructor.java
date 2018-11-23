package com.ssi;

public class StringConstructor {
    public static void main(String[] args) {

        //Object using Sting args constructor
        String s1=new String("indore");
        //Object using char[] args constructor
        //creating character array
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};
        String s2=new String(ch);
        //Object using char[],int,int args constructor
        String s3=new String(ch,2,3);//2-offset, 3-no_of_chars
        //Object using byte[] args constructor
        //creaging byte array
        byte b[]={65,66,67,68,69,70,71,72,73,74,75};
        String s4=new String(b);
        //Object using byte[],int,int args constructor
        String s5=new String(b,1,5);//1-offset,5-no_of-bytes
        //Object using 0 args constructor
        String s6=new String();     
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
