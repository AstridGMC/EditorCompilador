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
public class Compilador {
    private String nombre;
    private String lanzamiento;
    private String version;
    private String autor;
    private String extension;
    private AnalizadorLexico analizadorLex;
    private AnalizadorSintactico analizadorSintactico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public AnalizadorLexico getAnalizadorLex() {
        return analizadorLex;
    }

    public void setAnalizadorLex(AnalizadorLexico analizadorLex) {
        this.analizadorLex = analizadorLex;
    }

    public AnalizadorSintactico getAnalizadorSintactico() {
        return analizadorSintactico;
    }

    public void setAnalizadorSintactico(AnalizadorSintactico analizadorSintactico) {
        this.analizadorSintactico = analizadorSintactico;
    }

    public Compilador(String nombre) {
        this.nombre = nombre;
    }
    
}
