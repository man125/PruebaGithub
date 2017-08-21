/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://github.com/man125/PruebaGithub.git
 */
package pruebagit;

/**
 *
 * @author manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**Declaramos el objeto*/
 VentanaPrincipal miVentanaPrincipal;
 /**Instanciamos el objeto*/
 miVentanaPrincipal= new VentanaPrincipal();
 /**Enviamos el objeto como parametro para que sea unico
  * en toda la aplicación*/
  miVentanaPrincipal.setVentanaPrincipal(miVentanaPrincipal);
 /**Hacemos que se cargue la ventana*/
  miVentanaPrincipal.setVisible(true);
    }
    
}
