/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de un rectangulo
 * @author Barillas
 */
public class Rectangulo extends Superficie{
    float base;
    float altura;
    int angulosInternos;

    /**
     * Metodo vacio
     */
    public Rectangulo() {
    }

    /**
     * Metodo para ingresar los valores de un rectangulo
     * @param base Base del rectangulo
     * @param altura Altura del rectangulo
     * @param angulosInternos Angulos internos del rectangulo
     */
    public Rectangulo(float base, float altura, int angulosInternos) {
        this.base = base;
        this.altura = altura;
        this.angulosInternos = angulosInternos;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAngulosInternos() {
        return angulosInternos;
    }

    public void setAngulosInternos(int angulosInternos) {
        this.angulosInternos = angulosInternos;
    }
    
    /**
     * Metodo que muestra el area del rectangulo
     */
    public void area(){
        System.out.println("Area de 4...");
    }
    
    /**
     * Metodo que muestra el perimetro del rectangulo
     */
    public void perimetro(){
        System.out.println("Perimetro de 3.5 ...");
    }
    
    /**
     * Metodo que muestra el punto medio de la diagonal del rectangulo
     */
    public void puntoMedioEntreDiag(){
        System.out.println("Punto medio(2,3)");
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura 
                + ", angulosInternos=" + angulosInternos + '}';
    }

}
