/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editorcompilador;

import Backend.Compilador.Componente;
import Backend.Compilador.ExpresionRegular;
import Backend.Compilador.Token;
import Frontend.Principal;
import java.util.ArrayList;

/**
 *
 * @author astridmc
 */
public class EditorCompilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
       Principal principal = new Principal();
       principal.setVisible(true);
       /*
       Token uno = new Token("acb2");
       Token dos = new Token("cb1");
       ArrayList<Token> tokens= new ArrayList();
       tokens.add(uno);
       tokens.add(dos);
       char[] unoChar= {'a','b','c'};
       char[] dosChar= {'1','2','3'};
       Componente com1=new Componente(unoChar,'*');
       Componente com2=new Componente(dosChar,'1');
       ArrayList<Componente> componentes= new ArrayList();
       componentes.add(com1);
       componentes.add(com2);
       ExpresionRegular epresion = new ExpresionRegular("letra", componentes);
       
       epresion.EvaluarToken(tokens);
        System.out.println(epresion.isPertenece());
       */
    }
    
}
