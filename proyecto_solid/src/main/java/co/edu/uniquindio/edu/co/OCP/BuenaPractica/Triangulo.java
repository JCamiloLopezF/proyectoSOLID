package co.edu.uniquindio.edu.co.OCP.BuenaPractica;

public class Triangulo implements Calculo{
    private double base;
    private double altura;
    private final int CONSTANTE = 2;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base*altura)/CONSTANTE;
    }
}
