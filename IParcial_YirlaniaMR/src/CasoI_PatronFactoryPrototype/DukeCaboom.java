/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoI_PatronFactoryPrototype;


public class DukeCaboom implements JuguetePrototype, Cloneable{
    private int id;
    public DukeCaboom() {
    }

    @Override
    public void mover(String direccion, String parte) {
        System.out.println("Movi el "+ parte+ "hacia "+ direccion);
    }

    @Override
    public void sonido() {
        System.out.println("Cabooom");
    }

    @Override
    public JuguetePrototype clonar() {
        try {
            return (JuguetePrototype) clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
   
}
