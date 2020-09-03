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
public class Nodo {

    private Nodo derecho;
    private Nodo izquierdo;
    private int numNodo;
    private ArrayList<Integer> primeros;
    private ArrayList<Integer> ultimos;
    private ArrayList<Integer> siguientes;
    private String valor;
    private boolean anulable;

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getNumNodo() {
        return numNodo;
    }

    public void setNumNodo(int numNodo) {
        this.numNodo = numNodo;
    }

    public ArrayList<Integer> getPrimeros() {
        return primeros;
    }

    public void setPrimeros(ArrayList<Integer> primeros) {
        this.primeros = primeros;
    }

    public ArrayList<Integer> getUltimos() {
        return ultimos;
    }

    public void setUltimos(ArrayList<Integer> ultimos) {
        this.ultimos = ultimos;
    }

    public ArrayList<Integer> getSiguientes() {
        return siguientes;
    }

    public void setSiguientes(ArrayList<Integer> siguientes) {
        this.siguientes = siguientes;
    }
    

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isAnulable() {
        return anulable;
    }

    public void setAnulable(boolean anulable) {
        this.anulable = anulable;
    }

    public Nodo(String valor, int numNodo) {
        this.valor = valor;
        this.numNodo = numNodo;
        primeros= new ArrayList();
        ultimos = new ArrayList();
        siguientes= new ArrayList();
    }
    
      public Nodo(String valor) {
        this.valor = valor;
        primeros= new ArrayList();
        ultimos = new ArrayList();
        siguientes= new ArrayList();
    }


    public boolean agregarNodo(Nodo nodo) {
        if (izquierdo != null) {
            derecho = nodo;
            return true;
        } else if (derecho != null) {
            izquierdo = nodo;
            return true;
        } else {
            return false;
        }
    }

    public boolean anulable(Nodo nodo) {
        String simbolo = nodo.getValor();
        switch (simbolo) {
            case "·":
                if (nodo.izquierdo.isAnulable() && nodo.derecho.isAnulable()) {
                    return true;
                } else {
                    return false;
                }
            case "||":
                if (nodo.izquierdo.isAnulable() || nodo.derecho.isAnulable()) {
                    return true;
                } else {
                    return false;
                }
            case "**":
                return true;
            case "??":
                return true;
            case "++":
                return true;
            case "~":
                return true;
            default:
                return false;
        }
    }

    public ArrayList<Integer> AgregarPrimeros(Nodo nodo) {
        ArrayList<Integer> primeros = new ArrayList();
        String simbolo = nodo.getValor();
        switch (simbolo) {
            case "·":
                if (nodo.izquierdo.isAnulable()) {
                    primeros.addAll(nodo.getIzquierdo().getPrimeros());
                    primeros.addAll(nodo.getDerecho().getPrimeros());
                    return primeros;
                } else {
                    primeros = nodo.getIzquierdo().getPrimeros();
                    return primeros;
                }
            case "||":
                primeros.addAll(nodo.getIzquierdo().getPrimeros());
                primeros.addAll(nodo.getDerecho().getPrimeros());
                return primeros;
            case "**":
                primeros = nodo.getPrimeros();
                return primeros;
            case "??":
                primeros = nodo.getPrimeros();
                return primeros;
            case "++":
                primeros = nodo.getPrimeros();
                return primeros;
            case "~":
                primeros.add(nodo.getNumNodo());
                return primeros;
            default:
                primeros.add(nodo.getNumNodo());
                return primeros;
        }
    }

    public ArrayList<Integer> AgregarUltimos(Nodo nodo) {
        ArrayList<Integer> ultimos = new ArrayList();
        String simbolo = nodo.getValor();
        switch (simbolo) {
            case "·":
                if (nodo.derecho.isAnulable()) {
                    ultimos.addAll(nodo.getIzquierdo().getUltimos());
                    ultimos.addAll(nodo.getDerecho().getUltimos());
                    return ultimos;
                } else {
                    ultimos = nodo.getDerecho().getUltimos();
                    return ultimos;
                }
            case "|":
                ultimos.addAll(nodo.getIzquierdo().getUltimos());
                ultimos.addAll(nodo.getDerecho().getUltimos());
                return ultimos;
            case "*":
                ultimos = nodo.getUltimos();
                return ultimos;
            case "?":
                ultimos = nodo.getUltimos();
                return ultimos;
            case "+":
                ultimos = nodo.getUltimos();
                return ultimos;
            case "~":
                ultimos = nodo.getUltimos();
                return ultimos;
            default:
                ultimos = nodo.getUltimos();
                return ultimos;
        }
    }

    public void printInOrder() {
        if (izquierdo != null) {
            izquierdo.printInOrder();
        }
        System.out.println(valor);
        if (derecho != null) {
            derecho.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(valor);
        if (izquierdo != null) {
            izquierdo.printPreOrder();
        }
        if (derecho != null) {
            derecho.printPreOrder();
        }
    }

    public void printPosOrder() {
        if (izquierdo != null) {
            izquierdo.printPreOrder();
        }
        if (derecho != null) {
            derecho.printPreOrder();
        }
        System.out.println(valor);
    }

    public void RecorrerArbol(Nodo nodo) {
        if (nodo.getIzquierdo() == null) {

        } else {

        }
    }
}
