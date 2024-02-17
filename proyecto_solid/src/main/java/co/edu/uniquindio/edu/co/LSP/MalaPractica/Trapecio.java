package co.edu.uniquindio.edu.co.LSP.MalaPractica;

public class Trapecio extends Figura {
    private double ladoB;
    private double ladob;
    private double ladoL;
    private double ladol;
    private double h;
    
    public double calcularArea(){
        return ((ladoB+ladob)/2)*h;
    }

    @Override
    public double calcularPerimetro() {
        return ladoB+ladob+ladoL+ladol ;
    }
}
