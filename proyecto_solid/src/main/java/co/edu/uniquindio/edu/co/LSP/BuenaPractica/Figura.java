package co.edu.uniquindio.edu.co.LSP.BuenaPractica;

public abstract class Figura {
    public abstract double calcularPerimetro(); 
    public abstract double calcularVolumen();
}
//En este ejemplo cumpliendo con el principio de la sustitución de Liskov estas subclases usan todos los comportamientos de la superclase y no agregan ningún comportamiento adicional. 
