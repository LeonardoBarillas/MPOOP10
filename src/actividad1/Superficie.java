/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase abstracta de una duperficie
 * @author Barillas
 */
public abstract class Superficie extends Object implements FiguraGeometrica {

    /**
     * Metodo vacio
     */
    public Superficie() {
    }
    
    /**
     * Metodo de dimension de la superficie
     * @return Dimension de la superficie
     */
    public int dimension(){
        return 2;
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
