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
public class Componente {
    char[]comp;
    char sim;

    public Componente(char[] lexema, char sim) {
        this.comp = lexema;
        this.sim = sim;
    }

    public Componente() {
    }

    public char[] getComp() {
        return comp;
    }

    public void setComp(char[] comp) {
        this.comp = comp;
    }

    public char getSim() {
        return sim;
    }

    public void setSim(char sim) {
        this.sim = sim;
    }
    
    
}
