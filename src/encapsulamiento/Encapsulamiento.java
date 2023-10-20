package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30);

        // Acceder a los atributos a través de los métodos públicos
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Modificar la edad
        persona.setEdad(35);
        System.out.println("Nueva Edad: " + persona.getEdad());

        // Intentar establecer una edad negativa (no se permitirá)
        persona.setEdad(-5); // Esto mostrará un mensaje de error en la consola
       
    }
    
}
