/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import mx.desarrollo.facade.FacadeProfesor;


/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeProfesor facadeprofesor;
    
    
    public static FacadeProfesor getInstanceFacadeProfesor(){
        if (facadeprofesor == null) {
            facadeprofesor = new FacadeProfesor();
            return facadeprofesor;
        } else {
            return facadeprofesor;
        }
    }
    
   
}
