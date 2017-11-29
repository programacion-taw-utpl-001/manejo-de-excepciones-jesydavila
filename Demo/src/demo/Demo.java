/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad= entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        
        
        //muestra los datos
        System.out.printf("Ingrese su nombre es %s",nombre);
        System.out.printf("Ingrese su edad es %d", edad);
        
    }
    
}
