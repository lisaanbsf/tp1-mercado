/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.mercado;

/**
 *
 * @author Alumno
 */
public class Tp1Mercado {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionMatematica suma = new OperacionMatematica("suma","+",3);
        OperacionMatematica modulo = new OperacionMatematica("modulo","%",2);
        OperacionMatematica resta = new OperacionMatematica("resta","-",2);
        suma.mostraroperacion(5, 6);
        modulo.mostraroperacion(5,6);
        resta.mostraroperacion(5, 6);
        
        System.out.println(suma.calcular(5, 6));
        System.out.println(modulo.calcular(5, 6));
        System.out.println(resta.calcular(5,6));
    }
    
}
