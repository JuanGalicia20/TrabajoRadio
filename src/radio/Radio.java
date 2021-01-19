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
public interface Radio {
    public boolean encenderApagar();
    public boolean amFm();
    public double avanzar();
    public String guardar(int boton);
    public String seleccionar(int boton);
}
