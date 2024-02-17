package co.edu.uniquindio.edu.co.ISP.BuenaPractica;

public class Guitarra implements InstumentoMusical{

    @Override
    public void tocarAcorde() {
       System.out.println("tocar acorde de mi");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de do");
    }

    @Override
    public void tocarPiezaMusical() {
        System.out.println("tocar Adelita de Francisco Tárrega");
    }

}
