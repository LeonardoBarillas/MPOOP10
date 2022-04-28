/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de una elipse
 * @author Barillas
 */
public class Elipse extends Linea{
    float puntosFocales;
    float ejeMayor;
    float ejeMenor;

    /**
     * Metodo vacio
     */
    public Elipse() {
    }

    /**
     * Metodo para ingresar los datos de una elipse
     * @param puntosFocales Puntos focales de la elipse
     * @param ejeMayor Eje mayor de la elipse
     * @param ejeMenor Eje menor de la elipse
     */
    public Elipse(float puntosFocales, float ejeMayor, float ejeMenor) {
        this.puntosFocales = puntosFocales;
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public float getPuntosFocales() {
        return puntosFocales;
    }

    public void setPuntosFocales(float puntosFocales) {
        this.puntosFocales = puntosFocales;
    }

    public float getEjeMayor() {
        return ejeMayor;
    }

    public void setEjeMayor(float ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public float getEjeMenor() {
        return ejeMenor;
    }

    public void setEjeMenor(float ejeMenor) {
        this.ejeMenor = ejeMenor;
    }
    
    /**
     * Metodo que muestra la exentricidad de una elipse
     */
    public void excentricidad(){
        System.out.println("Excentricidad...");
    }
    
    /**
     * Metodo que muestra el perimetro de una elipse
     */
    public void perimetro(){
        System.out.println("Perimetro...");
    }
    
    /**
     * Metodo que muestra el area de una elipse
     */
    public void area(){
        System.out.println("Area...");
    }
    
    @Override
    public String toString() {
        return "Eclipse{" + "puntosFocales=" + puntosFocales + ", ejeMayor=" + 
                ejeMayor + ", ejeMenor=" + ejeMenor + '}';
    }
}
