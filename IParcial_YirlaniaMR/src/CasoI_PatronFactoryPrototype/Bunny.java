/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoI_PatronFactoryPrototype;

/**
 *
 * @author sebastianmejiasrodriguez
 */
public class Bunny implements JuguetePrototype, Cloneable{
    
    public Bunny(){}
    
    @Override
    public void mover(String direccion, String parte) {
        System.out.println("Movi el "+ parte+ "hacia "+ direccion);
    }

    @Override
    public void sonido() {
        System.out.println("Hola, soy Bunny");
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
