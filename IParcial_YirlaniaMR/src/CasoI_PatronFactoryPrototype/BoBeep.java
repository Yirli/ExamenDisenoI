/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoI_PatronFactoryPrototype;

public class BoBeep implements JuguetePrototype, Cloneable{
    private int id;
    
    public BoBeep() {
    }

    @Override
    public void mover(String direccion, String parte) {
        System.out.println("Movi el "+ parte+ "hacia "+ direccion);
    }

    @Override
    public void sonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JuguetePrototype clonar() {
        try {
            return (JuguetePrototype) clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
