package com.cnunescorrea;

public class Main {

    public static void main(String[] args) {
	    System.out.println("First line from app");
	    System.out.println("Second line from app");
	    System.out.println("Third line from app");

	    String value = "pluralsight";
	    StringReverser reverser = new StringReverser();  // Inst Classe
		String reverseString =  reverser.reverse(value); // execute method
		System.out.println(reverseString);
    }
}
