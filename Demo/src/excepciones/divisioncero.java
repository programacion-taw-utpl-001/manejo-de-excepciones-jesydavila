/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class divisioncero {

    public static void main(String[] args) {
        // TODO code application logic here

        //int valor= Integer.parseInt("Loja");
        int result=0;
        int n=0;
        int d=0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("ingrese el numerador");
            n = entrada.nextInt();
            System.out.println("ingrese denominador");
            d= entrada.nextInt();
        
        try { 
            result=n/d;
            
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.err.println("el resultado es "+result);
        }while(d==0);
    }
    
      
}
