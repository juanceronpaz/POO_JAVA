package aggregation;

public class Aggregation {

    public static void main(String[] args) {
   
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan");
        Empleado empleado2 = new Empleado("María");

        // Crear departamento
        Departamento departamento = new Departamento("Recursos Humanos");

        // Agregar empleados al departamento
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);

        // Mostrar información
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Empleados:");
        for (Empleado empleado : departamento.getEmpleados()) {
            System.out.println("- " + empleado.getNombre());
        }
    } 
}
