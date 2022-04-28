/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los valores de una parabola
 * @author Barillas
 */
public class Parabola extends Linea{
    float foco;
    float vertice;
    String color;

    /**
     * Metodo vacio
     */
    public Parabola() {
    }

    /**
     * Metodo par aingresar los valores de una parabola
     * @param foco Foco de la parabola
     * @param vertice Vertice de la parabola
     * @param color Color de la parabola
     */
    public Parabola(float foco, float vertice, String color) {
        this.foco = foco;
        this.vertice = vertice;
        this.color = color;
    }

    public float getFoco() {
        return foco;
    }

    public void setFoco(float foco) {
        this.foco = foco;
    }

    public float getVertice() {
        return vertice;
    }

    public void setVertice(float vertice) {
        this.vertice = vertice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para mostrar la distacia focal
     */
    public void distanciaFocal(){
        System.out.println("Distancia focal de 5...");
    }
    
    /**
     * Metodo para mostrar la distancia de la directriz de la parabola
     */
    public void distanciaDirectriz(){
        System.out.println("Distancia directriz es de 7...");
    }
    
    /**
     * Metodo para mostrar el perimetroo de la parabola
     */
    public void perimetro(){
        System.out.println("Perimetro de 22...");
    }
    
    @Override
    public String toString() {
        return "Parabola{" + "foco=" + foco + ", vertice=" + vertice 
                + ", color=" + color + '}';
    }
        
}
