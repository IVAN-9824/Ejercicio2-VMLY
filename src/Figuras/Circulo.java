/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author IFRODRIGUERO
 */
public class Circulo {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float perimetro(){
        float perimetro;
        perimetro= (float) (2* Math.PI*this.radio);
     return perimetro;
    }
    public float area(){
    return (float) (Math.PI*this.radio*this.radio);
    }
}
