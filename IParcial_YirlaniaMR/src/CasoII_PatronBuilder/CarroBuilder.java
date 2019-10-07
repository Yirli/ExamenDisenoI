/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoII_PatronBuilder;

/**
 *
 * @author sebastianmejiasrodriguez
 */
public abstract class CarroBuilder {
    protected Carro carro;
    
    public void createNewCarro(){
        carro = new Carro() ;

    }
    public Carro getCarro(){
        return carro;
    }
    
    public abstract void setNombre();
    public abstract void setMotor();
    public abstract void setNumPasajeros();
    public abstract void setAltura();
    public abstract void setLargo();
    public abstract void setAncho();
    public abstract void setMarca();
    
    
}
