/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retotres;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author delga
 */
public class RetoTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Repuesto repuesto = new Repuesto();
        ArrayList<String> listaRepuestos = new ArrayList<>(Arrays.asList("CHASIS", "FRENOS", "MOTOR", "FRENOS", "DIRECCION", "EMBRAGUE", "MOTOR"));
        System.out.println(repuesto.obtenerRepuestos(listaRepuestos));
        
        ArrayList<Integer> listaPosiciones = new ArrayList<>(Arrays.asList(0,1,4,5,6));
        ArrayList<String> faltantes = new ArrayList<>(Arrays.asList("EMBRAGUE", "FRENOS", "MOTOR", "EMBRAGUE", "DIRECCION", "EMBRAGUE", "MOTOR"));
        String categoria = "EMBRAGUE";
        System.out.println(repuesto.obtenerRepuestosFaltantes(listaPosiciones, faltantes, categoria));
        
        ArrayList<String> listaRepuestos8Agosto = new ArrayList<>(Arrays.asList("EMBRAGUE", "RUEDA", "FRENOS", "CAJA", "DIRECCION", "MOTOR"));
        ArrayList<String> listaRepuestosJuanPis = new ArrayList<>(Arrays.asList("SUSPENSION", "RUEDA", "CAJA", "EMBRAGUE", "PATIN"));
        System.out.println(repuesto.obtenerFaltantes(listaRepuestos8Agosto, listaRepuestosJuanPis));
        
        ArrayList<String> listaRepuestos8Agosto2 = new ArrayList<>(Arrays.asList("EXPLORADORA", "RUEDA", "FRENOS", "MOTOR", "DIRECCION", "CAJA"));
        ArrayList<String> listaRepuestosJuanPis2 = new ArrayList<>(Arrays.asList("SUSPENSION", "RUEDA", "CAJA", "EMBRAGUE", "PATIN"));
        System.out.println(repuesto.obtenerSobrantesIntercambiables(listaRepuestos8Agosto2, listaRepuestosJuanPis2));
        
        /*
        no pasa el caso obtenerSobrantesIntercambiables con los siguientes argumentos 
        [[9, 8, 2, 24, 41, 3, 37, 10, 4, 21, 28, 1, 33, 40, 38], 
        [25, 1, 2, 3, 8, 7, 13, 20, 36, 12, 34, 0, 32, 26, 35, 27]]
        */
    }
    
}
