/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mpoop10;

/**
 * Interface Intrumento Musical
 * @author Barillas
 */
public interface InstrumentoMusical {
    // Por defecto todos los metodos definidos dentro de una interfaz son 
    // publicos y abstractos
    
    /**
     * Metodo para afinar
     */
    void afinar();
    
    /**
     * Metodo para tocar
     */
    void tocar();
    
    /**
     * Metodo para mostrar que tipo de instumento es
     * @return Tipo de Instrumento
     */
    String tipoInstrumento();
    
}

