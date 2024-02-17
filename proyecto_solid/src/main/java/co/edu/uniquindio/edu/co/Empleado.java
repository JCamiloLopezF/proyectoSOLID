package co.edu.uniquindio.edu.co;

import java.time.LocalDate;

/**
 * Esto es lo que NO se debe hacer en el principio SOLID 1, el principio de responsabilidad única SRP
 *
 */
public class Empleado{
    private String nombre;
    private int salario;
    private LocalDate vacaciones;

    public int calcularSalario(){
        return salario;
    }
    public LocalDate gestionarVacaciones(){
        return vacaciones;
    }
    /** Esto está mal hecho, ya que la clase está contando con 2 responsabilidades, las cuales se pueden dividir en 2 clases o en 2 interfaces, esto, para que la clase empleado solo se encargue del empleado en general y no se tenga que modificar el código a futuro, sino implementar lo nuevo que se necesite */
}

