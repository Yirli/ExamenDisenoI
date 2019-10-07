/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoI_PatronFactoryPrototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebastianmejiasrodriguez
 */
public class Woody implements JuguetePrototype, Cloneable{

    public Woody() {
    }

    @Override
    public void mover(String direccion, String parte) {
        System.out.println("Movi el "+ parte+ "hacia "+ direccion);
    }

    @Override
    public void sonido() {
        System.out.println("Tengo una serpiente en mi bota");
    }

    @Override
    public JuguetePrototype clonar() {
        try {
            return (JuguetePrototype) clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    
    
}
