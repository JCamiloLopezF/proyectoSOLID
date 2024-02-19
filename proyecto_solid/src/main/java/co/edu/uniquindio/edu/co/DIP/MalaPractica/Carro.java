package co.edu.uniquindio.edu.co.DIP.MalaPractica;

public class Carro {
    
    private ServicioAceleracion acelerar;
    private ServicioFrenado frenar;
    private boolean deseoAumentoVelocidad;
    

    public Carro(ServicioAceleracion acelerar, ServicioFrenado frenar) {
        this.acelerar = acelerar;
        this.frenar = frenar;
    }

    public void controlarVelocidad(){
        
        if(deseoAumentoVelocidad){
            acelerar.usarAcelerador();
        }
        else{
            frenar.usarFreno();
        }
        /*En este caso se utiliza la clase ServicioAceleracion y ServicioFrenado 
        para las funcionalidades, por lo que está dependiendo 
        de clases en lugar de abstracciones
        */
    }
}
