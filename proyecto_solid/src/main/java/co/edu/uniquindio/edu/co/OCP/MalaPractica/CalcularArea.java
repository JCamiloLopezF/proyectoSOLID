package co.edu.uniquindio.edu.co.OCP.MalaPractica;

import java.util.List;

public class CalcularArea {
    public double calcularAreaTotal(List<Object> areas) {
        double areaTotal = 0;
        for (Object area : areas) {
            if (area instanceof Triangulo) {
                areaTotal += ((Triangulo) area).calcularAreaFigura();
            }
            else if (area instanceof Rectangulo) {
                areaTotal += ((Rectangulo) area).calcularAreaFigura();
            } 

            /**Aquí se agregan más condicionales, en caso de querer calcular más figuras

            En caso de querer agregar más figuras, se tendrá que modificar este bloque de codigo
            por lo que no se estaría implementando el principio OCP
            **/
        }
        return areaTotal;
    }
}
