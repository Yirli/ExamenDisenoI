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
public class Rex implements JuguetePrototype, Cloneable{
    Rex(){}

    @Override
    public void mover(String direccion, String parte) {
        System.out.println("Movi el "+ parte+ "hacia "+ direccion); 
    }

    @Override
    public void sonido() {
        System.out.println("Rawwr"); 
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
