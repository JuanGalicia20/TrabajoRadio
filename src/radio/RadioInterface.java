/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 * Programa de simulacion de radio
 * Algoritmos y Estructuras de datos
 * @author Jonathan Espinoza & Juan Andres Galicia
 * @version 21/01/22
 */
public interface RadioInterface {
    public boolean encenderApagar();
    public boolean amFm();
    public double avanzar();
    public String guardar(int boton);
    public String seleccionar(int boton);
}
