/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignacion;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_alumnos = 4;
        int contador = 1;
        double not=0;
        Estudiante[] lista = new Estudiante[4];
        double[] notas_matematicas = new double[4];
        double[] notas_sociales = new double[4];
         
        System.out.println("Ingrese nombre de estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese apellido de estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese nota de matematicas");
        String nota_matematica = entrada.nextLine();
        System.out.println("Ingrese nota de sociales");
        String nota_sociales = entrada.nextLine();

        try {
            contador = contador +1;
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error al ingresar");
          
        }
        System.err.println("el resultado es "+ not);
        

          //  pro = Double.parseDouble(nota_matematica);
            //pro = Double.parseDouble(nota_sociales);

    }
}
