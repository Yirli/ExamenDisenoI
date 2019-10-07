/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoII_PatronBuilder;

import java.util.ArrayList;

public class CadillacEscalade extends CarroBuilder{

    @Override
    public void setMotor() {
        ArrayList<String> motor = new ArrayList();
        motor.add("Motor Electrico");
        carro.setMotor(motor);
    }

    @Override
    public void setNumPasajeros() {
        carro.setNumPasajeros(7);
    }

    @Override
    public void setAltura() {
        carro.setAltura(1896);
    }

    @Override
    public void setLargo() {
        carro.setLargo(5179);
    }

    @Override
    public void setAncho() {
        carro.setAncho(2061);
    }

    @Override
    public void setMarca() {
        carro.setMarca("Cadillac");
    }

   @Override
    public void setNombre() {
        carro.setNombre("Cadillac Escalade");
    }
    
    
}

