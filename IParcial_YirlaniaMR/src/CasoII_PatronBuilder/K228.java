/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoII_PatronBuilder;

import java.util.ArrayList;


public class K228  extends CarroBuilder{

   @Override
    public void setMotor() {
        ArrayList<String> motor = new ArrayList();
        motor.add("Motor Electrico");
        carro.setMotor(motor);
    }

    @Override
    public void setNumPasajeros() {
        carro.setNumPasajeros(5);
    }

    @Override
    public void setAltura() {
        carro.setAltura(1490);
    }

    @Override
    public void setLargo() {
        carro.setLargo(4670);
    }

    @Override
    public void setAncho() {
        carro.setAncho(1817);
    }

    @Override
    public void setMarca() {
        carro.setMarca("Buick");
    }

    @Override
    public void setNombre() {
        carro.setNombre("K228");
    }
}
