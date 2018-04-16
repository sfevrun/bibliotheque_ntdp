/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.unice.miage.ntdp.bibliotheque;

import java.io.Serializable;

/**
 *
 * @author edou
 */
public enum TypeAuteur implements Serializable{
    PRINCIPAL, 
    COAUTEUR ;
   
    public String getType(){
        return this.name();
    }
}
