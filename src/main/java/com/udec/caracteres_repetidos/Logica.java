/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.caracteres_repetidos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julian esteban vallejo galindo
 */
public class Logica {
    
    String letra;   
    List<String> lista = new ArrayList<>();
    List<String> repetidas = new ArrayList<>();
    String letraInicial;
    
    /**
     * Este metodo sirve para asignarle valor a letrainicial
     * @param frase este string guarda la frase digitada
     */
    public void asignar(String frase){
        letraInicial = Character.toString(frase.charAt(0));
        imprimir(letraInicial);
        lista.add(letraInicial);
        comparar(frase,letraInicial);
    }
    
    /**
     * Este metodo compara si los caracteres son iguales o diferentes y si la lista esta vacia
     * @param frase este string guarda la frase digitada
     * @param letraInicial este string guarda la letra que se va a comparar
     */
    public void comparar(String frase, String letraInicial){
        for(int i=1; i<frase.length();i++){           
            if(letraInicial.length() > 0 ){
                letra = Character.toString(frase.charAt(i));
                if(letraInicial.compareToIgnoreCase(letra) == 0){
                    remover(letra);
                    System.out.println("Leyendo..............................." +  " " + frase.charAt(i)); 
                    if(lista.isEmpty()){
                        System.out.println("No hay letras que no se repitan");
                    }else{
                        System.out.println("La primera letra que no se repite es: " +  " " + lista.get(0));
                        letraInicial = lista.get(0);
                    }                                            
                }else{           
                    System.out.println("Leyendo..............................." +  " " + frase.charAt(i));
                    System.out.println("La primera letra que no se repite es: " +  " " + letraInicial);
                    if(lista.contains(letra)){
                        remover(letra);
                    }else{
                        lista.add(letra); 
                    }           
                }
            }
            if(lista.isEmpty()){
                if(++i<frase.length()){
                    letraInicial = Character.toString(frase.charAt(i));
                    if(lista.contains(letraInicial)|| repetidas.contains(letraInicial)){
                        remover(letra);
                        System.out.println("Leyendo..............................." +  " " + letraInicial);
                        System.out.println("No hay letras que no se repitan");
                        letraInicial = "";
                    }else{                        
                        System.out.println("Leyendo..............................." +  " " + letraInicial);
                        System.out.println("La primera letra que no se repite es: " +  " " + letraInicial);
                        i= i+1;
                    }
                }
            }            
        }  
    }
    
    /**
     * Este metodo sirve para imprimir la primera vez
     * @param letraInicial este string guarda la primera letra
     */
    public void imprimir(String letraInicial){
        System.out.println("Leyendo..............................." +  " " + letraInicial);
        System.out.println("La primera letra que no se repite es: " +  " " + letraInicial);
    }
    
    /**
     * Este metodo sirve para añadir a lista de repetidas y quitar el caracter de la lista
     * @param letra 
     */
    public void remover(String letra){
        repetidas.add(letra);
        lista.removeAll(repetidas);
    }
}

