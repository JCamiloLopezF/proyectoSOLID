package co.edu.uniquindio.edu.co.ISP.MalaPractica;

public class Guitarra implements InstumentoMusical{

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde de fa");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de si");
    }

    @Override
    public void tocarVibrato() {
        System.out.println("tocar vibrato en el 2 traste de la 5ta cuerda");
    }

}
