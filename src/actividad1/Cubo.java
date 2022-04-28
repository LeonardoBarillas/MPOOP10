/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de un cubo
 * @author Barillas
 */
public class Cubo extends Volumen{
    int angulosInternos;
    float arista;
    int NumVertices;

    /**
     * Metodo vacio
     */
    public Cubo() {
    }

    /**
     * Metodo para ingresar los datos de un cubo
     * @param angulosInternos Angulos internos del cubo
     * @param arista Aristas del cubo
     * @param NumVertices Numero de vertices del cubo
     */
    public Cubo(int angulosInternos, float arista, int NumVertices) {
        this.angulosInternos = angulosInternos;
        this.arista = arista;
        this.NumVertices = NumVertices;
    }

    public int getAngulosInternos() {
        return angulosInternos;
    }

    public void setAngulosInternos(int angulosInternos) {
        this.angulosInternos = angulosInternos;
    }

    public float getArista() {
        return arista;
    }

    public void setArista(float arista) {
        this.arista = arista;
    }

    public int getNumVertices() {
        return NumVertices;
    }

    public void setNumVertices(int NumVertices) {
        this.NumVertices = NumVertices;
    }

    /**
     * Clase que muestra el volumen del cubo
     */
    public void volumen(){
        System.out.println("Volumen de 33...");
    }
    
    /**
     * Clase que muestra el area superficial del cubo
     */
    public void areaSuperficial(){
        System.out.println("Area superficial de 40...");
    }
    
    /**
     * Metodo que muestra la suma de los angulos iunternos del cubo
     */
    public void sumaAngulosInternos(){
        System.out.println("720 de angulos internos....");
    }
    
    
    @Override
    public String toString() {
        return "Cubo{" + "angulosInternos=" + angulosInternos + ", arista=" 
                + arista + ", NumVertices=" + NumVertices + '}';
    }
    
}
