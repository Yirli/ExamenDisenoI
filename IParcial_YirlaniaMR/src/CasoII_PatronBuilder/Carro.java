/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoII_PatronBuilder;

import java.util.ArrayList;

public class Carro {
    private ArrayList<String> motor;
    private int altura;
    private int largo;
    private int ancho;
    private int numPasajeros;
    private String marca;
    private String nombre;

   

    public Carro() {
    }

    
    public void setMotor(ArrayList<String> motor) {
        this.motor = motor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<String> getMotor() {
        return motor;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }
    

     @Override
    public String toString() {
        String info = "Nombre: "+nombre+"\nMarca: "+ marca+ 
        "\nNumero de Pasajeros: "+ numPasajeros+ "\nAltura: "+altura+
        "\nLargo: "+ largo+ "\nAncho: "+ancho+ "\nMotor: "+motor.get(0);
        return info;
    }
    
}
