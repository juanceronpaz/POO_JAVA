package pkg080923;

import excercise.Persona;
import java.util.Scanner;

public class Main {
    
    static String readAString(String lblText){
        System.out.println(lblText);
        return new Scanner(System.in).nextLine();
    }
    public static void main(String[] args){
     int limitObjet = 3;
     Persona[] arrayPerson = new Persona[limitObjet];
     
     //Instancia//Generar ciclo para guardar estos datos en los limite que el programa defina ingresando todo por el teclado
     System.out.println("Ingrese los valores de Nombre - Documento - Ciudad");
     for(int i = 0; i < limitObjet; i++){
         arrayPerson[i] = new Persona(readAString("Ingresa el Nombre: "), readAString("Ingresa el Documento: "),readAString("Ingresa la Ciudad: "));
     }
     
     for(int i = 0; i < limitObjet; i++){
         System.out.println("N: " + arrayPerson[i].getName());
         System.out.println("D: " + arrayPerson[i].getDocument());
         System.out.println("c: " + arrayPerson[i].getCountry());
         System.out.println("-----");
     }
    }
}