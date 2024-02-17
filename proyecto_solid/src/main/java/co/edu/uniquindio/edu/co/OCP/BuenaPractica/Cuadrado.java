package co.edu.uniquindio.edu.co.OCP.BuenaPractica;

public class Cuadrado implements Calculo{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
}

