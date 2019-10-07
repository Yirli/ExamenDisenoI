/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoIII_PatronBuilder;

import java.io.File;


public class Formato {
    private File docSalida;
    
      
    public void write(String codigo) {
        System.out.println("Escribe en el archivo docSalida el documento correspondiente");
    }


    public void mainParser(char token) {
        System.out.println("Recibe el char y selecciona a cual de los subparsers enviarselo, ya sea un codigo de escape o texto");
        escapePagParser(token);
        textoParser(token);
        escapeUniParser(token);
    }

    public String escapePagParser(char token) {
        System.out.println("Lee el código de escape de pagina y lo traduce por el código correspondiente");
        return "token";
    }


    public String textoParser(char token) {
        System.out.println("Lee texto y lo traduce por el código correspondiente");
        return "token";
    }


    public String escapeUniParser(char token) {
        System.out.println("Lee el código de escape unicode y lo traduce por el código correspondiente");
        return "token";
    }
    
}
