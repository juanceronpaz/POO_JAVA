package gestion_informacion_vehiculos;

public class Automovil extends Vehiculo {
    
    private int numeroPuertas;

    public Automovil(int numeroPuertas, String placa, String marca, String modelo, int año, String propietario) {
        super(placa, marca, modelo, año, propietario);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Puertas: " + numeroPuertas);
        int añosEnCirculacion = 2023 - super.año;
        System.out.println("Años en circulacion: " + añosEnCirculacion);
    }
}
