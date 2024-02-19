package co.edu.uniquindio.edu.co.ISP.BuenaPractica;

public class Guitarra implements Acorde, Escala, Vibrato{

    @Override
    public void tocarAcorde() {
       System.out.println("tocar acorde de mi");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de do");
    }

    @Override
    public void tocarVibrato() {
        System.out.println("tocar vibrato en la 4ta cuerda en el 2do traste");
    }

}
