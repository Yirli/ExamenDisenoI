/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoII_PatronBuilder;

public class Director {
    private CarroBuilder carroBuilder;

    public Director() {
    }
    
     public void setCarroBuilder(CarroBuilder cb){
         carroBuilder = cb;
     }
     
    public Carro getCarro(){
        return carroBuilder.getCarro();
    }
    
    public void construirCarro(){
        carroBuilder.createNewCarro();
        carroBuilder.setAltura();
        carroBuilder.setAncho();
        carroBuilder.setLargo();
        carroBuilder.setMarca();
        carroBuilder.setMotor();
        carroBuilder.setNumPasajeros();
        carroBuilder.setNombre();
        
    }
}
