/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoIII_PatronBuilder;

/**
 *
 * @author jupi
 */
public class EpubBuilder extends FormatoBuilder{

   @Override
    public void mainParser() {
        System.out.println("Epub");
        formato.mainParser('a');
    }

    @Override
    public String escapePagParser() {
        System.out.println("Epub");
        return formato.escapePagParser('a');
        
    }

    @Override
    public String textoParser() {
        System.out.println("Epub");
        return formato.textoParser('a');
    }

    @Override
    public String escapeUniParser() {
        System.out.println("Epub");
        return formato.escapeUniParser('a');
    }

    @Override
    public void write() {
        System.out.println("Epub");
        formato.write("1");
    }
    

    
}
