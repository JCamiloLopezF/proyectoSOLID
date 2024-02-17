package co.edu.uniquindio.edu.co.SRP.BuenaPractica;

public class GestorVacaciones implements GestionarVacacionesInterface{
    private int semanasTrabajadas;

    @Override
    public int  cantidadDiasVacaciones() {
        return semanasTrabajadas*4; //Se asume que el empleado puede tener 4 días de vacaciones por cada semana trabajada
    }
}
