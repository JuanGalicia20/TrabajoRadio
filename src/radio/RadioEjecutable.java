/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.io.Console;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Programa de simulacion de radio
 * Algoritmos y Estructuras de datos
 * @author Jonathan Espinoza & Juan Andres Galicia
 * @version 21/01/22
 */
public class RadioEjecutable {
    private static Radio radio1;
    
    /**
     * 
     * @param numero
     * @return 
     */
    public static int checkNumerico(String numero){
    int resultado = 0; //Valor predeterminado 0
    try{
        if(numero != null){
            resultado =  Integer.parseInt(numero);
            
            if(resultado < 0){
                resultado = Math.abs(resultado);
            }
        }
    }catch(NumberFormatException nfe){
        System.out.println("Error NumberFormatException value: " + numero);
    }
    return resultado;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       radio1 = new Radio();
       boolean estado = radio1.encenderApagar();
       boolean frecuencia = radio1.amFm();
       DecimalFormat df = new DecimalFormat("###.##");
        
       boolean keep = true;
       while (keep == true){ 
            System.out.print("-----------------Radio-----------------"
                        +"\n 1. Encender radio."+
                        "\n 2. Cambiar AM a FM o FM a AM."+
                        "\n 3. Avanzar en el dial de las emisoras."+
                        "\n 4. Guardar una emisora en uno de los 12 botones."+
                        "\n 5. Seleccionar la emisora puesta en un botón."+
                        "\n 6. Apagar Radio. "+
                        "\n 7. Salir"+
                        "\n----------------------------------------\n");
            String ingreso = JOptionPane.showInputDialog("Ingrese la opcion del menu que desee realizar: ");
            if(estado == false && !"1".equals(ingreso) && !"7".equals(ingreso)){
                System.out.println("Debes encender la radio antes de realizar una acción");
            }
            else if(estado == false && "7".equals(ingreso)){
                 System.exit(0);
            }
            else{
               switch(ingreso){
                case "1":
                    if(estado == true){
                        System.out.println("El radio ya esta encendido.");
                        break;
                    }
                    else{
                        estado = radio1.encenderApagar();
                        if(estado == true){
                            System.out.println("Radio encendido correctamente.");
                            break;
                        }
                 
                    }
                    break;
                case "2":
                   frecuencia = radio1.amFm();
                   if(frecuencia == false){
                       System.out.println("Radio en FM.");
                       break;
                   }
                   else{
                       System.out.println("Radio en AM");
                       break;
                   }
                   
                case "3":
                    double emisora = radio1.avanzar();
                    if(frecuencia == false){ 
                        System.out.println("Sintonizando emisora: " + df.format(emisora) + " FM");
                        break;
                    }
                    else{
                        System.out.println("Sintonizando emisora: " + emisora + " AM");
                        break;
                    }
                case "4":
                    String bton = JOptionPane.showInputDialog("Ingrese el numero de boton en el que desea guardar la emisora: ");
                    int intBton = checkNumerico(bton);
                    if(intBton != 0){
                        if(intBton >= 1 && intBton <= 12){
                            String r = radio1.guardar(intBton);
                            System.out.println("Emisora guardada exitosamente");
                            System.out.println(r);
                            break;
                        }
                        else{
                            System.out.println("Debes ingresar un valor de boton entre 1 y 12");
                            break;
                        }
                    }
                    else{
                        System.out.println("Debes ingresar un valor valido!");
                        break;
                    }
                case "5":
                    String bton1 = JOptionPane.showInputDialog("Ingrese el numero de boton que desea seleccionar: ");
                    int intBton1 = checkNumerico(bton1);
                    if(intBton1 != 0){
                        if(intBton1 >= 1 && intBton1 <= 12){
                            String radio = radio1.seleccionar(intBton1);
                            if(frecuencia == false){
                                 System.out.println(radio);
                                 break;
                            }
                            else{
                                System.out.println(radio);
                                break;
                            }

                        }
                        else{
                            System.out.println("Debes ingresar un valor de boton entre 1 y 12");
                            break;
                        }
                    }
                    else{
                        System.out.println("Debes ingresar un valor valido!");
                        break;
                    }
                case "6":
                    
                    if(estado == false){
                        System.out.println("El radio ya esta apagado.");
                        break;
                    }
                    else{
                        estado = radio1.encenderApagar();
                        if(estado == false){
                            System.out.println("Radio apagado correctamente.");
                            System.out.println("Hasta Luego! turututu");
                            break;
                        }
                 
                    }
                case "7":
                    System.exit(0);
                default:
                    System.out.println("Debes ingresar un valor valido!");
            }
    }
   } 
    }
}
