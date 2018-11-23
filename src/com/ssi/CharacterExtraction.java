package com.ssi;

public class CharacterExtraction {
    public static void main(String[] args) {
        String s="ABCDEF";
        System.out.println("Extracting char at index 2");
        char ch=s.charAt(2);//will return 'C'
        System.out.println(ch);
        System.out.println("Extracting all chars as an char array");
        char c[]=s.toCharArray();
        for(char tmp:c){
            System.out.println(tmp);
        }
        System.out.println("Extracting all chars as an byte array");
        byte b[]=s.getBytes();
        for(byte tmp:b){
            System.out.println(tmp);
        }
    }
    
}
