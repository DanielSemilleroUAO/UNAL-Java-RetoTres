/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retotres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delga
 */
public class Repuesto {
    
    public ArrayList<String> obtenerRepuestos(ArrayList<String> listaRepuestos){
        ArrayList<String> nuevaLista = new ArrayList<>();
        for (int i = 0; i < listaRepuestos.size(); i++) {
            String listaRepuesto = listaRepuestos.get(i);
            if(!nuevaLista.contains(listaRepuesto)){
                nuevaLista.add(listaRepuesto);
            }         
        }
        return nuevaLista;
    }
    
    
    public ArrayList<Integer> obtenerRepuestosFaltantes(ArrayList<Integer> listaPosiciones, ArrayList<String> faltantes, String categoria){
        ArrayList<Integer> nuevaLista = new ArrayList<>();
        for (int i = 0; i < listaPosiciones.size(); i++) {
            int pos = listaPosiciones.get(i);
            if(faltantes.get(pos).equals(categoria)){
                nuevaLista.add(pos);
            }
        }
        return nuevaLista;
    }
    
    public ArrayList<String> obtenerFaltantes(ArrayList<String> listaRepuestos8Agosto, ArrayList<String> listaRepuestoJuanPis){
        ArrayList<String> nuevaLista = new ArrayList<>();
        for (int i = 0; i < listaRepuestos8Agosto.size(); i++) {
            String repuestAgosto = listaRepuestos8Agosto.get(i);
            if(!listaRepuestoJuanPis.contains(repuestAgosto)){
                nuevaLista.add(repuestAgosto);
            }
        }
        return nuevaLista;
    }
    
    public Integer obtenerSobrantesIntercambiables(ArrayList<String> listaRepuestos8Agosto, ArrayList<String> listaRepuestosJuanPis){
        int contA = 0;
        int contB = 0;
        for (int i = 0; i < listaRepuestosJuanPis.size(); i++) {
            if(!listaRepuestos8Agosto.contains(listaRepuestosJuanPis.get(i))){
                contA++;
            }
        }
        for (int i = 0; i < listaRepuestos8Agosto.size(); i++) {
            if(!listaRepuestosJuanPis.contains(listaRepuestos8Agosto.get(i))){
                contB++;
            }
        }
        if(contA > contB){
            return contB;
        }
        
        return contA;
    }
    
}
