/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.prueba;

import flota.domain.Camion;
import flota.domain.CamionException;
import flota.domain.Vehiculo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class PruebaExceptionCamion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo ban = new Camion(89,"55SUWQG2"); 
        try {
            //ban.cargar(999999999);
            ban.cargar(0);
        } catch (CamionException ex) {
            System.out.println("ERROR: " + ex);
        }
       
    }
    
}
