/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoIII_PatronBuilder;


public class Director_2 {
    private FormatoBuilder formatoBuilder;
    
    public void construirFormato(){
        formatoBuilder.scanner();
        formatoBuilder.mainParser();
        formatoBuilder.write();
    }
    
    public void setFormatoBuilder(FormatoBuilder fb){
        System.out.println("aqui");
        this.formatoBuilder = fb;
    }
    
    public Formato getFormato(){
        return formatoBuilder.getFormato();
    }
    
}
