package co.edu.uniquindio.edu.co.SRP.BuenaPractica;

import java.time.LocalDate;

public class EmpleadoBuenaResponsabilidadUnica implements CalcularSalario, GestionarVacaciones{
    private String nombre;
    private int valorSemana;
    private int semanasTrabajadas;
    private LocalDate vacaciones;


    @Override
    public double calcularSalario() {
        return valorSemana*semanasTrabajadas;
    }


    @Override
    public int  cantidadDiasVacaciones() {
        return semanasTrabajadas*4; //Se asume que el empleado puede tener 4 días de vacaciones por cada semana trabajada
    }
   
}