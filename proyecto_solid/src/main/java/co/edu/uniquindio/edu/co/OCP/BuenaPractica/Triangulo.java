package co.edu.uniquindio.edu.co.OCP.BuenaPractica;


public class Triangulo implements Calculo{
    private double base;
    private double altura;
    private int CONSTANTE = 2;

    public Triangulo(double base, double altura, int cONSTANTE) {
        this.base = base;
        this.altura = altura;
        CONSTANTE = CONSTANTE;
    }

    @Override
    public double calcularArea(){
        return (base*altura)/CONSTANTE;
    }
}
