package co.edu.uniquindio.edu.co.OCP.MalaPractica;

public class Rectangulo {
    private double lado;

    public Rectangulo(double lado) {
        this.lado = lado;
    }

    public double calcularAreaFigura(){
        return lado*lado;
    }
}
