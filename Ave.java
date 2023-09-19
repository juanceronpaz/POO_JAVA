package herencia_polimorfismo;

public class Ave extends Animal {
    
    String especie;

    public Ave(String especie, String nombre, String edad, String tipo_alimnetacion) {
        super(nombre, edad, tipo_alimnetacion);
        this.especie = especie;
    }
    
    @Override
    public void sonidoAnimal() {
        System.out.println("Pio Pio");
    }
    
}