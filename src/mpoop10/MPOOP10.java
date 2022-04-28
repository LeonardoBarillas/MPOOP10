/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

import actividad1.Elipse;
import actividad1.FiguraGeometrica;
import actividad1.Recta;

/**
 * Clase principal
 * @author Barillas
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        InstrumentoMusical instrumento = flauta;
        instrumento.tocar();
        instrumento.afinar();
        
        double pi = Math.PI;
        double e = Math.E;
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Math.abs(-100));
        
        System.out.println("El mes " + Meses.NUEVE + " corresponde a " 
                + Meses.NOMBRE_MESES[Meses.NUEVE]);
        
        
        System.out.println("\n############################\n");
        
        Recta recta = new Recta(3, 6, 9);
        System.out.println(recta);
        System.out.println(recta.dimension());
        
        FiguraGeometrica figura = recta;
        recta.crearse();
        recta.dibujarse();
        recta.moverse(); 
        recta.borrarse();
        recta.anguloPendNeg();
        recta.longPendienteNeg();
        recta.modificarPend();
        
        System.out.println("\n############################\n");
        Elipse eclipse = new Elipse(4,8,12);
        System.out.println(eclipse);
        System.out.println(eclipse.dimension());
        FiguraGeometrica figura2 = eclipse;
        eclipse.crearse();
        eclipse.dibujarse();
        eclipse.moverse();
        eclipse.borrarse();
        eclipse.area();
        eclipse.excentricidad();
        eclipse.perimetro();
               
    }
    
}

