/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoIII_PatronBuilder;

public class PdfBuilder extends FormatoBuilder{
    

    @Override
    public void mainParser() {
        System.out.println("");
        System.out.println("Formato de Salida: PDF");
        formato.mainParser('a');
    }

    @Override
    public String escapePagParser() {
  
        return formato.escapePagParser('a');
        
    }

    @Override
    public String textoParser() {
        
        return formato.textoParser('a');
    }

    @Override
    public String escapeUniParser() {
        
        return formato.escapeUniParser('a');
    }

    @Override
    public void write() {
        System.out.println("");
        System.out.println("Formato de Salida: PDF");
        formato.write("1");
    }
}
