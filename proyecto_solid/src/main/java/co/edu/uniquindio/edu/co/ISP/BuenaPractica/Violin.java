package co.edu.uniquindio.edu.co.ISP.BuenaPractica;

public class Violin implements Acorde, Escala, Vibrato {

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde de sol");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de la");
    }

    @Override
    public void tocarVibrato() {
        System.out.println("tocar vibrato sostenuto");
    }
    
}
