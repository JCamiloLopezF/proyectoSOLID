package co.edu.uniquindio.edu.co.LSP.MalaPractica;

public abstract class Figura {
    public abstract double calcularPerimetro();
    public abstract double calcularVolumen(); 
}
//En este ejemplo incumpliendo con el principio de la sustitución de Liskov estas subclases no usan todos los comportamientos de la superclase, por lo que lanzan una excepción e incluso agrega un comportamiento adicional. 
