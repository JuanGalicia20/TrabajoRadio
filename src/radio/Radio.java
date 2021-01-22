/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.text.DecimalFormat;

/**
 *
 * @author Jonathan Espinoza - 20022
 * @author Juan Andres Galicia - 20298
 * @version 1.0 - 2021/22/1
 */
public class Radio implements RadioInterface {
    private boolean estadoRadio;
    private boolean frecuencia;
    private double emisoraFM = 87.90; 
    private int emisoraAM = 530;
    private double[] botones = new double[12];
    DecimalFormat df = new DecimalFormat("###.##");

    /**
     * 
     */
    public Radio() {
        this.estadoRadio = true;
        this.frecuencia = true;
    }
    /**
     * 
     * @return 
     */
    @Override
    public boolean encenderApagar() {
        //Cambiar de falso a verdadero o viceversa
        if(estadoRadio == false){
            estadoRadio = true;
        }
        else{
            estadoRadio = false;
        }
        return estadoRadio;
    }
    /**
     * 
     * @return 
     */
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
    /**
     * 
     * @return 
     */
    @Override
    public double avanzar() {
        //Avanzar entre las emisoras dependiendo de la frecuencia
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
    /**
     * 
     * @param boton
     * @return 
     */
    @Override
    public String guardar(int boton) {
        //Guardar una sintonia dentro de el arreglo de botones
        if(frecuencia == false){
            botones[boton-1] = emisoraFM;
             return "Se ha guardado la emisora: " + df.format(emisoraFM) + " en el boton: #"+ (boton);
        }
        else{
            botones[boton-1] = emisoraAM;
            return "Se ha guardado la emisora: " + emisoraAM + " en el boton: #"+ (boton );
        }
       
    }
    /**
     * 
     * @param boton
     * @return 
     */
    @Override
    public String seleccionar(int boton) {
        //Seleccionar entre las emisoras de los botones favoritos
        if(botones[boton-1]%2 != 0){
            frecuencia = false;
            emisoraFM = botones[boton-1];
            return "Sintonizando: " + df.format(emisoraFM) + " FM";
        }
        else{
            frecuencia = true;
            emisoraAM = (int)Math.round(botones[boton-1]);
            return "Sintonizando: " + emisoraAM + " AM";
        }
        
    }
}
