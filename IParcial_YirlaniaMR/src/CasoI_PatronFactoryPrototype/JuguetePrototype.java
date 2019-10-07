/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoI_PatronFactoryPrototype;


public interface JuguetePrototype {
    public void mover(String direccion, String parte);
    public void sonido();
    public JuguetePrototype clonar();
}
