/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.AnalizadorLexico;

import java.util.ArrayList;

/**
 *
 * @author astridmc
 */
public class Arbol {

    private Nodo nodo;

    private ArrayList<Nodo> hojas = new ArrayList();

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public void ProcesarSuiguientes(Nodo nodo ){
        SacarHojas(nodo);
        SacarSiguientes(nodo);
    }
    
    public void SacarSiguientes(Nodo nodo){
          if (nodo.getIzquierdo() != null) {
            SacarHojas(nodo.getIzquierdo());
        }
        if (nodo.getDerecho() != null) {
            SacarHojas(nodo.getDerecho());
        }
        if (agragarHojas(nodo)) {
            agregarSiguentes(nodo);
        }
    }

    public void SacarHojas(Nodo nodo) {
        if (nodo.getIzquierdo() != null) {
            SacarHojas(nodo.getIzquierdo());
        }
        if (nodo.getDerecho() != null) {
            SacarHojas(nodo.getDerecho());
        }
        if (agragarHojas(nodo)) {
            hojas.add(nodo);
        }
    }


    public boolean agragarHojas(Nodo nodo) {
        if ("**".equals(nodo.getValor())) {
            return false;
        } else if ("~".equals(nodo.getValor())) {
            return false;
        } else if ("·".equals(nodo.getValor())) {
            return false;
        } else if ("++".equals(nodo.getValor())) {
            return false;
        } else if ("||".equals(nodo.getValor())) {
            return false;
        } else if ("??".equals(nodo.getValor())) {
            return false;
        } else {
            return true;
        }
    }

    private void agregarSiguentes(Nodo nodo) {
        if (nodo.getValor().equals("·")) {
            if (nodo.getIzquierdo() != null) {
                for (int i = 0; i < nodo.getIzquierdo().getUltimos().size(); i++) {
                    int nod = BuscarNodo(nodo.getIzquierdo().getUltimos().get(i));
                    for (int j = 0; j < nodo.getDerecho().getUltimos().size(); j++) {
                        hojas.get(nod).getSiguientes().add(nodo.getDerecho().getUltimos().get(j));
                    }
                }
            }
        } else if (nodo.getValor().equals("**") || nodo.getValor().equals("++")) {
            for (int i = 0; i < nodo.getIzquierdo().getUltimos().size(); i++) {
                int nod = BuscarNodo(nodo.getIzquierdo().getUltimos().get(i));
                for (int j = 0; j < nodo.getIzquierdo().getPrimeros().size(); j++) {
                    hojas.get(nod).getSiguientes().add(nodo.getIzquierdo().getPrimeros().get(j));
                }
            }
            
        }
    }

    public int BuscarNodo(int j) {
        for (int i = 0; i < hojas.size(); i++) {
            if (hojas.get(i).getNumNodo() == j) {
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }

}
