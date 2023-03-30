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
public class OperacionMatematica {
   private String nombre;
   private String simbolo;
   private int cantoperadores;
   
   
   public void mostraroperacion(int a, int b) {
        System.out.println(a + this.simbolo + b);
        
   }
   
   public int calcular(int a, int b){
       if(this.simbolo=="+"){
           return a+b;
       }else if(this.simbolo =="%"){
           return a%b;
       }else if(this.simbolo =="-"){
           return a-b;
                   }
       return 0;
   }

    public OperacionMatematica(String nombre, String simbolo, int cantoperadores) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.cantoperadores = cantoperadores;
    }
   
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getCantoperadores() {
        return cantoperadores;
    }

    public void setCantoperadores(int cantoperadores) {
        this.cantoperadores = cantoperadores;
    }
   
   
   
}
