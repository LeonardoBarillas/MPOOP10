/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que muestra los datos de una recta
 * @author Barillas
 */
public class Recta extends Linea{
    float pendientePosit;
    float anguloPendPosit;
    float longitud;

    /**
     * Metodo vacio 
     */
    public Recta() {
    }

    /**
     * Meotodo para ingresar los datos de una recta
     * @param pendientePosit Pendiente positiva de la recta
     * @param anguloPendPosit Angulo de la pendiente positiva de la recta
     * @param longitud Longitud de la recta
     */
    public Recta(float pendientePosit, float anguloPendPosit, float longitud) {
        this.pendientePosit = pendientePosit;
        this.anguloPendPosit = anguloPendPosit;
        this.longitud = longitud;
    }

    public float getPendientePosit() {
        return pendientePosit;
    }

    public void setPendientePosit(float pendientePosit) {
        this.pendientePosit = pendientePosit;
    }

    public float getAnguloPendPosit() {
        return anguloPendPosit;
    }

    public void setAnguloPendPosit(float anguloPendPosit) {
        this.anguloPendPosit = anguloPendPosit;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    /**
     * Metodo que muestra la pendiente negativa de la parabola
     */
    public void longPendienteNeg(){
        System.out.println("Pendiente negativo...");
    }
    
    /**
     * Metodo que muestra el angulo negativo de la pendiente de la recta
     */
    public void anguloPendNeg(){
        System.out.println("Angulo negativo...");
    }
    
    /**
     * Metodo que modifica la pendiente de la recta
     */
    public void modificarPend(){
        System.out.println("Modificando pendiente...");
    }

    @Override
    public String toString() {
        return "Recta{" + "pendientePosit=" + pendientePosit 
                + ", anguloPendPosit=" + anguloPendPosit + ", longitud=" 
                + longitud + '}';
    }
    
}
