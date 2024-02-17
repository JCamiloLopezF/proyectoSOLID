package co.edu.uniquindio.edu.co.ISP.BuenaPractica;

public class Violin implements InstumentoMusical {

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde de sol");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de la");
    }

    @Override
    public void tocarPiezaMusical() {
        System.out.println("tocar Paganiniana");
    }
    
}
