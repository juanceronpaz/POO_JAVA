package herencia_polimorfismo;

public abstract class Animal {
    
    private String nombre, edad, tipo_alimnetacion ;

    public Animal(String nombre, String edad, String tipo_alimnetacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_alimnetacion = tipo_alimnetacion;
    }
    
    public abstract void sonidoAnimal();
    
}