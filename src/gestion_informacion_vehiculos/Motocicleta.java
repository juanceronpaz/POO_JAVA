package gestion_informacion_vehiculos;

public class Motocicleta extends Vehiculo{
    
    private double cilindrada;

    public Motocicleta(double cilindrada, String placa, String marca, String modelo, int año, String propietario) {
        super(placa, marca, modelo, año, propietario);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
   
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        int añosEnCirculación = 2023 - super.año;
        System.out.println("Años en circulacion: " + añosEnCirculación);
    }
}
