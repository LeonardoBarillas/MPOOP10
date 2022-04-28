/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de un circulo
 * @author Barillas
 */
public class Circulo extends Superficie{
    float radio;
    float diametro;
    float diagonal;

    /**
     * Metodo vacio
     */
    public Circulo() {
    }

    /**
     * Metodo para ingresar los valores de un circulo
     * @param radio Radio del circulo 
     * @param diametro Diametro del circulo
     * @param diagonal  Diagonal del circulo
     */
    public Circulo(float radio, float diametro, float diagonal) {
        this.radio = radio;
        this.diametro = diametro;
        this.diagonal = diagonal;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }
    
    /**
     * Metodo para mostrar el perimetro del circulo
     */
    public void perimetro(){
        System.out.println("Perimetro de 12...");
    }
    
    /**
     * Metodo para mostrar el area del circulo
     */
    public void area(){
        System.out.println("Area de 27...");
    }
    
    /**
     * Metodo para mostrar la cuerda de un circulo
     */
    public void cuerda(){
        System.out.println("Cuerda de 8...");
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro 
                + ", diagonal=" + diagonal + '}';
    }
    
}
