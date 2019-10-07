/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoIII_PatronBuilder;

import java.io.File;


public abstract class FormatoBuilder {
    protected Formato formato;

    public FormatoBuilder(Formato formato) {
        this.formato = formato;
    }

    public FormatoBuilder() {
    }

    
    
    public Formato getFormato() {
        return formato;
    }
    
    public void createNewFormato(){
        formato = new Formato();
    }
    
    public char scanner(){
        System.out.println("Paso 1: leyendo y reconociendo tokens");
        return 't';
    }
    
    public abstract void mainParser();
    public abstract String escapePagParser();
    public abstract String textoParser();
    public abstract String escapeUniParser();
    public abstract void write();
}
