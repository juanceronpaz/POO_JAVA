package main;

import poo.unicauca.edu.co.e1.e1;

public class main {
    
    public static void main(String[] args) {
        //Create instance
        e1 call = new e1();
        
        // System.out.println("First Name: " + call.firstName);
        // System.out.println("Last Name: " + call.lastName);
        
        int result = call.sum (1,6);
        System.out.println(result);
        
        System.out.println("First Name: " + call.getFirstName());
        System.out.println("Last Name: " + call.getLastName());
    }
}
