package co.edu.uniquindio.edu.co.ISP.MalaPractica;

public class Violin implements InstumentoMusical {

    @Override
    public void tocarAcorde() {
        System.out.println("tocar acorde con 4ta disminuida ");
    }

    @Override
    public void tocarEscala() {
        System.out.println("tocar escala de fa doble sostenido");
    }

    @Override
    public void tocarVibrato() {
        System.out.println("tocar vibrato en dinámica Forte");
    }
    
}
