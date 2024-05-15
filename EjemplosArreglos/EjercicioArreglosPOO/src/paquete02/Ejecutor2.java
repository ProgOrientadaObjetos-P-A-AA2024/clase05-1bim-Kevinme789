/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
/**
 *
 * @author utpl
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10,9,8,10};
        String nombreEstudiante = "Rene Elizalde";
        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
        notas);
        libreta.establecerPromedio();
        // Si comentamos la linea 17 no estableceremos el promedio de las notas
        // por lo tanto nos imprimara 0.00 al no haber establecido un valor
        // al atributo promedio
        libreta.establecerPromedioCualitativo();
        // Si comentamos la linea 20 no estableceremos el Promedio Cualitativo
        // por lo tanto se imprimira como null al no haber establecido un valor
        // al atributo promedioCualitativo.
        System.out.printf("%s", libreta);
                
    }
}
