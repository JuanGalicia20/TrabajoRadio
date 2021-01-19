/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author Jonat
 */
public class radioPrototipo implements Radio {
    private boolean estadoRadio;
    private boolean frecuencia;
    private double emisoraFM = 87.9; 
    private int emisoraAM = 530;
    private double[] botones = new double[12];

    public radioPrototipo() {
        this.estadoRadio = false;
        this.frecuencia = false;
    }

    @Override
    public String toString() {
        return "radioCarro{" + "estadoRadio=" + estadoRadio + '}';
    }
    
    @Override
    public boolean encenderApagar() {
        if(estadoRadio == false){
            estadoRadio = true;
        }
        else{
            estadoRadio = false;
        }
        return estadoRadio;
    }

    @Override
    public boolean amFm() {
        //false = fm
        //true = am
        if(frecuencia == false){
            frecuencia = true;
        }
        else{
            frecuencia = false;
        }
        return frecuencia;
    }

    @Override
    public double avanzar() {
        if(frecuencia == false){
           if(emisoraFM >= 87.9 && emisoraFM < 107.9){
               emisoraFM = emisoraFM + 0.2;
               
           }
           else if(emisoraFM >= 107.9){
               emisoraFM = 87.9;
            
           }
           return emisoraFM;
        }
        else{
            if(emisoraAM >= 530 && emisoraAM < 1610){
                emisoraAM = emisoraAM + 10;
            }
            else if (emisoraAM >= 1610){
                emisoraAM = 530;
            }
            return emisoraAM;
        }
    }

    @Override
    public String guardar(int boton) {
        if(frecuencia == false){
            botones[boton-1] = emisoraFM;
             return "Se ha guardado la emisora: " + emisoraFM + " en el boton: #"+ (boton);
        }
        else{
            botones[boton-1] = emisoraAM;
            return "Se ha guardado la emisora: " + emisoraAM + " en el boton: #"+ (boton);
        }
       
    }

    @Override
    public String seleccionar(int boton) {
        if(botones[boton-1]%2 != 0){
            frecuencia = false;
            emisoraFM = botones[boton-1];
            return "Sintonizando " + emisoraFM;
        }
        else{
            frecuencia = true;
            emisoraAM = (int)Math.round(botones[boton-1]);
            return "Sintonizando " + emisoraAM;
        }
        
    }

    public boolean isEstadoRadio() {
        return estadoRadio;
    }

    public boolean isFrecuencia() {
        return frecuencia;
    }

    public double getEmisoraFM() {
        return emisoraFM;
    }

    public int getEmisoraAM() {
        return emisoraAM;
    }

    public double[] getBotones() {
        return botones;
    }
    
    
    
}
