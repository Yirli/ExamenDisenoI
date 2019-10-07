/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoII_PatronBuilder;

import java.util.ArrayList;

/**
 *
 * @author sebastianmejiasrodriguez
 */
public class BoltEv extends CarroBuilder{

    @Override
    public void setMotor() {
        ArrayList<String> motor = new ArrayList();
        motor.add("Electrico");
        carro.setMotor(motor);
    }

    @Override
    public void setNumPasajeros() {
        carro.setNumPasajeros(5);
    }

    @Override
    public void setAltura() {
        carro.setAltura(1595);
    }

    @Override
    public void setLargo() {
        carro.setLargo(4166);
    }

    @Override
    public void setAncho() {
        carro.setAncho(1765);
    }

    @Override
    public void setMarca() {
        
        carro.setMarca("Chevrolet");
    }

    @Override
    public void setNombre() {
        carro.setNombre("BoltEV");
    }

    
}
