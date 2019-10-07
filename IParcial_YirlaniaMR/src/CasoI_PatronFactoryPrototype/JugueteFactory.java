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
public class JugueteFactory {
    enum TipoJuguete{
    Woody,
    BuzzLightYear,
    BoBeep,
    Bunny,
    Slinky,
    Forky,
    Rex,
    Alien,
    Duckie,
    DukeCaboom,
    Jessie
    }
    
    public JuguetePrototype fabricarJuguete(int j){
        switch(j){
            case 0:
                return new Woody();
            case 1:
                return new BuzzLightYear();
            case 2:
                return new BoBeep();
            case 3:
                return new Bunny();
            case 4:
                return new Slinky();
            case 5:
                return new Forky();
            case 6:
                return new Rex();
            case 7:
                return new Alien();
            case 8:
                return new Duckie();
            case 9:
                return new DukeCaboom();
            case 10:
                return new Jessie();
            default:
                return null;
        }
    }
}
