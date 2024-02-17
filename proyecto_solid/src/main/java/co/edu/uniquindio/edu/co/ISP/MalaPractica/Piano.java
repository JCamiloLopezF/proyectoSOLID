package co.edu.uniquindio.edu.co.ISP.MalaPractica;

public class Piano implements InstumentoMusical {

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde Dsus4");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar la escala mixolidia de los modos griegos");
    }

    /*Aqui esta es una mala práctica ya que esta clase Piano no le sirve este método que esta implementando 
    de la interfaz IntrumentoMusical, ya que para el piano es inutil este método, 
    porque el vibrato no es posible hacerlo en el piano
    */
    @Override
    public void tocarVibrato() {
        System.out.println("El piano no puede hacer vibrato");
    }

}
