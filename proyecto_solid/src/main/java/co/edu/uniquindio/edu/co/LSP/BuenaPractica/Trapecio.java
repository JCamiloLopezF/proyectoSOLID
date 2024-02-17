package co.edu.uniquindio.edu.co.LSP.BuenaPractica;

public class Trapecio extends Figura {
    private double ladoB;
    private double ladob;
    private double ladoL;
    private double ladol;

    @Override
    public double calcularPerimetro() {
        return ladoB+ladob+ladoL+ladol ;
    }
}
