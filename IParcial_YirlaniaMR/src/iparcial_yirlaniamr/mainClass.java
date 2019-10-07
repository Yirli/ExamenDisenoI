/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iparcial_yirlaniamr;

import CasoIII_PatronBuilder.AsciiBuilder;
import CasoIII_PatronBuilder.Director_2;
import CasoIII_PatronBuilder.EpubBuilder;
import CasoIII_PatronBuilder.Formato;
import CasoIII_PatronBuilder.FormatoBuilder;
import CasoII_PatronBuilder.BoltEv;
import CasoII_PatronBuilder.CadillacEscalade;
import CasoII_PatronBuilder.Carro;
import CasoII_PatronBuilder.CarroBuilder;
import CasoII_PatronBuilder.Director;
import CasoI_PatronFactoryPrototype.JugueteFactory;
import CasoI_PatronFactoryPrototype.JuguetePrototype;
import CasoI_PatronFactoryPrototype.Woody;


public class mainClass {

    
    public static void main(String[] args) {
       
       System.out.println("Caso 1: Juguetes Toy Story 4");
       
       JugueteFactory jf = new JugueteFactory();
       JuguetePrototype woody = jf.fabricarJuguete(0);
       woody.sonido();
        
        //Clonar a woody
        JuguetePrototype woody2 = woody.clonar();
        System.out.print("Soy una copia de woody, ");
        woody2.sonido();
       System.out.println("------------------------------");
        
       
        //Segundo Ejercicio
        
        System.out.println("Caso 2: Carros Electricos");
  
        Director director = new Director();
        CarroBuilder boltEV = new BoltEv();
        director.setCarroBuilder(boltEV);
        director.construirCarro();
        Carro carro = director.getCarro();
        
        System.out.println(carro.toString());
        System.out.println("------------------------------");
        
        //Tercer Ejercicio
        System.out.println("Caso 3: RTF");
  
        Director_2 dir = new Director_2();
        dir.setFormatoBuilder(new EpubBuilder());
        //FormatoBuilder fb = new EpubBuilder();
        

        System.out.println("------------------------------");
        
    }
    
}
