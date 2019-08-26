/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.caracteres_repetidos;

/**
 *
 * @author julian esteban vallejo galindo
 */
public class InicioPrograma {
    
    /**
     * Este metodo llama a solicitar frase
     */
    public static void Frase(){
        PedirFrase pedir = new PedirFrase();
        pedir.solicitarFrase();
    }
    
    /**
     * Inicia programa
     * @param args 
     */
    public static void main(String[] args){ 
        Frase();
    }
    
}
