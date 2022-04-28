/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestar los valores de un cuadrado
 * @author Barillas
 */
public class Cuadrado extends Superficie{
    float angulosInternos;
    float lado;
    float diagonal;

    /**
     * Metodo vacio
     */
    public Cuadrado() {
    }

    /**
     * Metodo para ingresar los valores de un cuadrado
     * @param angulosInternos Angulos internos del cuadrado
     * @param lado Lado del cuadrado
     * @param diagonal Diagonal del cuadrado
     */
    public Cuadrado(float angulosInternos, float lado, float diagonal) {
        this.angulosInternos = angulosInternos;
        this.lado = lado;
        this.diagonal = diagonal;
    }

    public float getAngulosInternos() {
        return angulosInternos;
    }

    public void setAngulosInternos(float angulosInternos) {
        this.angulosInternos = angulosInternos;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }
    
    /**
     * Metodo que muestar la diagonal perpendicular del cuadrado
     */
    public void diagonalPerpendicular(){
        System.out.println("Diagonal perpendicular de 10...");
    }
    
    /**
     * Metodo que muestar el perimetro de un cuadrado
     */
    public void perimetro(){
        System.out.println("Perimetro de 19...");
    }
    
    /**
     * Metodo que muestra el area de un cuadrado
     */
    public void area(){
        System.out.println("Area de 27...");
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "angulosInternos=" + angulosInternos + ", lado=" 
                + lado + ", diagonal=" + diagonal + '}';
    }

}
