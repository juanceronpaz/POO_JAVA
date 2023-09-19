package herencia_polimorfismo;

public class Main {

    public static void main(String[] args) {        
        
        Animal perro = new Perro("Pastor Aleman", "Firulais", "5", "Omnivoro");
        perro.sonidoAnimal();
        
        Animal gato = new Gato("Gato Aleman", "Juan", "2", "Omnivoro");
        gato.sonidoAnimal();
        
        Animal ave = new Ave("Pollito", "Peter", "1", "Omnivoro");
        ave.sonidoAnimal();
        
        Animal caballo = new Caballo("AraApaloosa", "Maximo", "3", "Omnivoro");
        caballo.sonidoAnimal();
    }
    
}