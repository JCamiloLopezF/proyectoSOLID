package co.edu.uniquindio.edu.co.SRP.BuenaPractica;

public class CalcularSalarioEmpleado implements CalcularSalarioInterface{
    private int valorSemana;
    private int semanasTrabajadas;
    @Override
    public double calcularSalario() {
        return valorSemana*semanasTrabajadas;
    }
}
