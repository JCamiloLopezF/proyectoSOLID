package co.edu.uniquindio.edu.co.ISP.BuenaPractica;

public class Piano implements Acorde, Escala{

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde de do");

    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de re");
    }

    /* Como se puede ver aqui, la interfaz vibrato no es necesaria 
    para el cliente piano por lo que no se implemento, , mostrando así la flexibilidad y 
    usabilidad de la segregación de interfaces */

}
