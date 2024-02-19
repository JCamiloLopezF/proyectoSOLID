package co.edu.uniquindio.edu.co.DIP.BuenaPractica;

/**
 * Estas mismas interfaces se pueden utilizar para crear cualquier otro tipo de vehiculo
 */

public class Carro{

    private boolean deseoAumentoVelocidad;
    private Acelerador acelerador;
    private Freno freno;

    public Carro(Acelerador acelerador, Freno freno){
        this.acelerador = acelerador;
        this.freno = freno;
    }

    public void controlarVelocidad(){
        
        if(deseoAumentoVelocidad){
            acelerador.usarAcelerador();  
        }                                 
        else{
            freno.usarFreno();  
        }
        /**
         * En este caso se está implementando la interface Acelerador e interface Freno, 
         * sin necesidad de llamar la clase que implementa a cada una
         * permitiendo así al mismo tiempo el principio OCP, extendiedolo sin modificarlo
         */
    }
}