package co.edu.uniquindio.edu.co.LSP.BuenaPractica;

public class Rombo extends Figura {
    private double lado;

    @Override
    public double calcularPerimetro() {  
        return 4*lado;
    }
}
