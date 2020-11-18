/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.domain;

/**
 *
 * @author user
 */
public class CamionException extends Exception {
    /**
     * 
     * @param aviso 
     */
    public CamionException(String aviso) {
        super(aviso);
    }
    
}
