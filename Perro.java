package herencia_polimorfismo;

public class Perro extends Animal {
    
    String raza;

    public Perro(String raza, String nombre, String edad, String tipo_alimnetacion) {
        super(nombre, edad, tipo_alimnetacion);
        this.raza = raza;
    }
    
    @Override
    public void sonidoAnimal() {
        System.out.println("Guauuu");
    }
    
}