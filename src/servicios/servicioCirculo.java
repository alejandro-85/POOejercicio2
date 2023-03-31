/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.circunferencia;
import java.util.Scanner;


public class servicioCirculo {
    circunferencia c1 = new circunferencia();
    
    public circunferencia crearCircunferencia(){
       
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio de la circunferencia");
    c1.setRadio(leer.nextDouble());
        area();
        perimetro();
return c1;
    }
    
   public void  area(){
       double area = Math.PI * Math.pow(c1.getRadio(),2) ;
       System.out.println(" la area es  " + area);
   }
    
   public void perimetro(){
       double perimetro = Math.PI *2*c1.getRadio() ;
       System.out.println(" la perimetro es  " + perimetro);
   }
}
