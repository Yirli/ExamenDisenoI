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
public class PdfBuilder extends FormatoBuilder{
    

    @Override
    public void mainParser() {
        System.out.println("PDF");
        formato.mainParser('a');
    }

    @Override
    public String escapePagParser() {
        System.out.println("PDF");
        return formato.escapePagParser('a');
        
    }

    @Override
    public String textoParser() {
        System.out.println("PDF");
        return formato.textoParser('a');
    }

    @Override
    public String escapeUniParser() {
        System.out.println("PDF");
        return formato.escapeUniParser('a');
    }

    @Override
    public void write() {
        System.out.println("PDF");
        formato.write("1");
    }
}
