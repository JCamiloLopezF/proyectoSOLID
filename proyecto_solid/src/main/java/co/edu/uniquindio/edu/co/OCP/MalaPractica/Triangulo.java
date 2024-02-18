package co.edu.uniquindio.edu.co.OCP.MalaPractica;

public class Triangulo {
    private double base;
    private double altura;
    private final int CONSTANTE = 2;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularAreaFigura(){
        return (base*altura)/CONSTANTE;
    }
}
