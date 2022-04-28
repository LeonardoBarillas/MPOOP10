/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de un cilindro
 * @author Barillas
 */
public class Cilindro {
    float altura;
    float radio;
    int numBases;

    /**
     * Metodo vacio
     */
    public Cilindro() {
    }
    
    /**
     * Metodo para ingresar los datos de un cilindro
     * @param altura Altura del cilindro
     * @param radio Radio de la base de un cilindro
     * @param numBases Numero de bases de un cilindro
     */
    public Cilindro(float altura, float radio, int numBases) {
        this.altura = altura;
        this.radio = radio;
        this.numBases = numBases;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public int getNumBases() {
        return numBases;
    }

    public void setNumBases(int numBases) {
        this.numBases = numBases;
    }
    
    /**
     * Metodo que muestra el volumen del cilindro
     */
    public void volumen(){
        System.out.println("Volumen de 38...");
    }
    
    /**
     * Metodo que muestra el area de la base de un cilindro
     */
    public void areaBase(){
        System.out.println("Area de base de 6...");
    }
    
    /**
     * Metodo que muestra el area superficial de un cilindro
     */
    public void areaSuperficial(){
        System.out.println("Area superficial de 62...");
    }
    
    @Override
    public String toString() {
        return "Cilindro{" + "altura=" + altura + ", radio=" + radio 
                + ", numBases=" + numBases + '}';
    }
}
