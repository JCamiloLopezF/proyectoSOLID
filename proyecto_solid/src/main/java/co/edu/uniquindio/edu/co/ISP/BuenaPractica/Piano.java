package co.edu.uniquindio.edu.co.ISP.BuenaPractica;

public class Piano implements InstumentoMusical {

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde de do");

    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de re");
    }

    @Override
    public void tocarPiezaMusical() {
        System.out.println("tocar Chopin Nocturne in c# minor");
    }

}
