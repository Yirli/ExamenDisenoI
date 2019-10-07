/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoIII_PatronBuilder;

import java.io.File;


public class AsciiBuilder extends FormatoBuilder{

    public AsciiBuilder() {
    }

    
   @Override
    public void mainParser() {
        System.out.println("Ascii");
        formato.mainParser('a');
    }

    @Override
    public String escapePagParser() {
        System.out.println("Ascii");
        return formato.escapePagParser('a');
        
    }

    @Override
    public String textoParser() {
        System.out.println("Ascii");
        return formato.textoParser('a');
    }

    @Override
    public String escapeUniParser() {
        System.out.println("Ascii");
        return formato.escapeUniParser('a');
    }

    @Override
    public void write() {
        System.out.println("Ascii");
        formato.write("1");
    }
    
    
}
