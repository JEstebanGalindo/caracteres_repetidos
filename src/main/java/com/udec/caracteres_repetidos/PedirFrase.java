/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.caracteres_repetidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase para pedir frase
 * @author julian esteban vallejo galindo
 */
public class PedirFrase {
    
    private final Scanner entrada = new Scanner(System.in);
    List<Integer> lista = new ArrayList<>();
    String frase;
    Logica logica = new Logica();
    
    /**
     * Este metodo solicita la frase
     */
    public void solicitarFrase(){
        boolean seguir = true;
        while (seguir == true) {
            if(lista.isEmpty()){
                System.out.print("Introduce una frase: ");          
                frase = entrada.nextLine();
                lista.add(frase.length());
                logica.asignar(frase);
            }else{
                System.out.print("¿Desea continuar? ");
                System.out.println("S / N ");
                String opcion = entrada.nextLine();
                if (opcion.equals("s") || opcion.equals("S")) {                   
                    inicializar();
                    System.out.print("Introduce una frase: "); 
                    frase = entrada.nextLine(); 
                    lista.add(frase.length());
                    logica.asignar(frase);
                }else{
                    seguir=false;
                }            
            }
        }
    }
    
    /**
     * Este metodo inicializa y elimina los datos guardados limpia la lista
     */
    public void inicializar(){
        frase = "";
        lista.clear();
    }
    
}
