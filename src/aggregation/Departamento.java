package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    
}
