/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Compilador;

/**
 *
 * @author astridmc
 */
public class Token {

    String lexema;
    String tipo;

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Token(String lexema) {
        this.lexema = lexema;
    }

     public Token( ) {
    }
}
