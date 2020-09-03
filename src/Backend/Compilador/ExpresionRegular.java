/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Compilador;

import java.util.ArrayList;

/**
 *
 * @author astridmc
 */
public class ExpresionRegular {

    String id;
    ArrayList<Componente> componentes;
    public char[][] letras;
    int indice = 0;
    int indiceComp = 0;
    boolean pertenece;

    public boolean isPertenece() {
        return pertenece;
    }

    public void setPertenece(boolean pertenece) {
        this.pertenece = pertenece;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExpresionRegular(String id, ArrayList<Componente> componentes) {
        this.id = id;
        this.componentes = componentes;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public boolean EvaluarToken(ArrayList<Token> tokensEntrada) {
        Token actual = tokensEntrada.get(indice);
        for (int i = 0; i < actual.lexema.length(); i++) {
            for (int j = 0; j < componentes.get(indiceComp).getComp().length; j++) {
                System.out.println(componentes.get(indiceComp).getComp()[j] + "   " + actual.lexema.charAt(i));
                if (componentes.get(indiceComp).getComp()[j] == actual.lexema.charAt(i)) {

                    pertenece = true;
                    System.out.println(pertenece);
                    if (indiceComp + 1 < componentes.size()) {
                    } else {
                        break;
                    }
                    break;
                } else {
                    pertenece = false;
                    System.out.println(pertenece);
                }
            }
            System.out.println("--------"+ pertenece);
            if(indiceComp+1<componentes.size()&&pertenece==false||indiceComp+1<componentes.size()&& componentes.get(indiceComp).getSim()=='1'){
                i--;
                indiceComp++;
            }else if(pertenece==false){
                break;
            }
        }
            
        return pertenece;
    }

}
