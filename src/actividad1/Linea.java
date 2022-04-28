/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * CLase abstracta de una linea
 * @author Barillas
 */
public abstract class Linea extends Object implements FiguraGeometrica{

    /**
     * Metodo vacio
     */
    public Linea() {
    }
    
    /**
     * Metodo de dimension de la linea
     * @return dimension de la linea
     */
    public int dimension(){
        return 1;
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
