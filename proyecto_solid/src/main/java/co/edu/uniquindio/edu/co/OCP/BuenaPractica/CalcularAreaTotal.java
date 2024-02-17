package co.edu.uniquindio.edu.co.OCP.BuenaPractica;

import java.util.List;

public class CalcularAreaTotal {


    public double areaTotal(List<Calculo> calculos) {
        double totalArea = 0;
        for (Calculo calculo : calculos) {
            totalArea += calculo.calcularArea();
        }
        return totalArea;
    }
    //se podrán agregar figuras, sin necesidad de modificar el codigo en este bloque
    //así se usa el principio OCP
}
