import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Automovil(4, "AXT456", "TOYOTA", "Hilux", 2015, "Sebastian"));
        vehiculos.add(new Automovil(4, "SFR765", "Ford", "Focus", 2020, "Maria"));
        vehiculos.add(new Automovil(4, "JKL234", "Nissan", "Sentra", 2016, "Pedro"));
        vehiculos.add(new Automovil(4, "MNO567", "Chevrolet", "Cruze", 2021, "Ronald"));
        vehiculos.add(new Automovil(4, "VWX456", "Hyundai", "Elantra", 2017, "Camilo"));
        vehiculos.add(new Motocicleta(250, "YZA789", "Yamaha", "XTZ250", 2022, "Daniel"));
        vehiculos.add(new Motocicleta(600, "DEF456", "Honda", "CBR 600", 2019, "Carlos"));
        vehiculos.add(new Motocicleta(1000, "GHI789", "Yamaha", "YZF R1", 2021, "Valentino"));
        vehiculos.add(new Motocicleta(300, "PQR890", "Kawasaki", "Ninja 300", 2020, "Santiago"));
        vehiculos.add(new Motocicleta(750, "STU123", "Suzuki", "GSX-R750", 2018, "Iikan"));
        
        Set<String> placas = new HashSet<>();
        ArrayList<Vehiculo> vehiculosSinDuplicados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (!placas.contains(vehiculo.getPlaca())) {
                vehiculosSinDuplicados.add(vehiculo);
                placas.add(vehiculo.getPlaca());
            }
        }

        for (Vehiculo vehiculo : vehiculosSinDuplicados) {
            vehiculo.mostrarInformacion();
            System.out.println("-----------------------------------");
        }

        for (Vehiculo vehiculo : vehiculosSinDuplicados) {
            if(vehiculo.getClass().equals(Automovil.class)){
                vehiculo.mostrarInformacion();
            }
            else{
                vehiculo.mostrarInformacion();
            }
            System.out.println("-----------------------------------");
        }

      
        for (Vehiculo vehiculo : vehiculosSinDuplicados) {
            if (vehiculo.getPlaca().equals("STU123")) {
                vehiculo.propietario = "Cristian";
            }
        }

        System.out.println("Vehiculos despues de modificar el propietario:");
        for (Vehiculo vehiculo : vehiculosSinDuplicados) {
            vehiculo.mostrarInformacion();
            System.out.println("-----------------------------------");
        }
        
        String placaBuscada = "YZA789";
        for (Vehiculo vehiculo : vehiculosSinDuplicados) {
            if (vehiculo.getPlaca().equals(placaBuscada)) {
                System.out.println("Vehiculo encontrado:");
                vehiculo.mostrarInformacion();
                break;
            }
        }
    }
 }
