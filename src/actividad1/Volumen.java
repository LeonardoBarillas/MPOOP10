/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase abstracta de un volumen
 * @author Barillas
 */
public abstract class Volumen extends Object implements FiguraGeometrica{

    /**
     * Metodo vacio
     */
    public Volumen() {
    }
    
    /**
     * Metodo de dimension de un volumen
     * @return Dimension de un volumen
     */
    public int dimension(){
        return 3;
    }
    
    @Override
    public void dibujarse() {
        System.out.println("Me estoy dibujando...");
    }

    @Override
    public void moverse() {
        System.out.println("Me estoy moviendo...");
    }

    @Override
    public void crearse() {
        System.out.println("Me estoy creando...");
    }

    @Override
    public void borrarse() {
        System.out.println("Me estoy borrando...");
    }
}
