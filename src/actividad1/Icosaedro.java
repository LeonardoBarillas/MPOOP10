/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los valores de un icosaedro
 * @author Barillas
 */
public class Icosaedro {
    float arista;
    int numDiagonales;
    int numCaras;

    /**
     * Metodo vacio
     */
    public Icosaedro() {
    }

    /**
     * Metodo para ingresar los valores de un icosaedro
     * @param arista Aristas del icosaedro
     * @param numDiagonales Numeor de diagonales del icosaedro
     * @param numCaras Numeor de caras del icosaedro
     */
    public Icosaedro(float arista, int numDiagonales, int numCaras) {
        this.arista = arista;
        this.numDiagonales = numDiagonales;
        this.numCaras = numCaras;
    }

    public float getArista() {
        return arista;
    }

    public void setArista(float arista) {
        this.arista = arista;
    }

    public int getNumDiagonales() {
        return numDiagonales;
    }

    public void setNumDiagonales(int numDiagonales) {
        this.numDiagonales = numDiagonales;
    }

    public int getNumCaras() {
        return numCaras;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    /**
     * Metodp que muestra el area total del icosaedro
     */
    public void areaTotal(){
        System.out.println("Area total de 29...");
    }
    
    /**
     * Metodo que muestra el area de una cara del icosaedro
     */
    public void areaDeUnaCara(){
        System.out.println("Area de una cara de 9...");
    }
    
    /**
     * Metodo que muestra el volumen de un icosaedro
     */
    public void Volumen(){
        System.out.println("Volumen de 44...");
    }
    
    @Override
    public String toString() {
        return "Icosaedro{" + "arista=" + arista + ", numDiagonales=" 
                + numDiagonales + ", numCaras=" + numCaras + '}';
    }
        
}
