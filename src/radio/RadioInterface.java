/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author Jonathan Espinoza - 20022
 * @author Juan Andres Galicia - 20298
 * @version 1.0 - 2021/22/1
 */
public interface RadioInterface {
    /**
     * 
     * @return 
     */
    public boolean encenderApagar();
    /**
     * 
     * @return 
     */
    public boolean amFm();
    /**
     * 
     * @return 
     */
    public double avanzar();
    /**
     * 
     * @param boton
     * @return 
     */
    public String guardar(int boton);
    /**
     * 
     * @param boton
     * @return 
     */
    public String seleccionar(int boton);
}
