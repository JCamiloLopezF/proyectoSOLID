package co.edu.uniquindio.edu.co.OCP.MalaPractica;

public class Triangulo {
    private double base;
    private double altura;
    private int CONSTANTE = 2;

    public Triangulo(double base, double altura, int cONSTANTE) {
        this.base = base;
        this.altura = altura;
        CONSTANTE = CONSTANTE;
    }
    public double calcularAreaFigura(){
        return (base*altura)/CONSTANTE;
    }
}
