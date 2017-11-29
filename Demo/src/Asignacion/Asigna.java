/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignacion;

/**
 *
 * @author Familia
 */
public class Asigna {
    
    double [] notas_matematicas;
    double []notas_sociales;
    Estudiante [] lista_persona;

    public Asigna(Estudiante[] lista_persona, double[] notas_matematicas, double[] notas_sociales) {
        this.lista_persona = lista_persona;
        this.notas_matematicas = notas_matematicas;
        this.notas_sociales = notas_sociales;
    }

    public Estudiante[] getLista_persona() {
        return lista_persona;
    }

    public void setLista_persona(Estudiante[] lista_persona) {
        this.lista_persona = lista_persona;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }
    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public String getTrabajadores() {
        String lista_trabajadores = "";
        for (int i = 0; i < this.trabajadores.length; i++) {
            lista_trabajadores += "\t" + (i + 1) + ")" + this.trabajadores[i].toString();
        }
        return lista_trabajadores;
    }
    public void lista(){
    String lista="";
    for(int i=0; i<4;i++){
    lista= lista_persona[i].toString()+notas_matematicas[i]+notas_sociales[i];
    }
    }
    public void obtener_promedio(){
    double pro=0, suma=0;
    double not1=0, not2=0;
    for(int i=0; i<4;i++)
        not1= notas_matematicas[1];
        not2= notas_sociales [1];
        suma= not1 + not2;
        pro= suma/2;
    }
    public void obtener_promedioTotal(){
    double pro=0, suma=0;
    double not1=0, not2=0;
    for(int i=0; i<4;i++)
        not1= notas_matematicas[1];
        not2= notas_sociales [1];
        
        pro= suma/2;
    }

    @Override
    public String toString() {
        return String.format("\"Lista de personas: %s "+"- matematicas %d\""+"\"- sociales %d\\\" ", getLista_persona(), getNotas_matematicas(), getNotas_sociales());
    }
    
    
    
}
