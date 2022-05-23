/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author IFRODRIGUERO
 */
public class Cuadrado {
    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;

    public Cuadrado(float lado1, float lado2, float lado3, float lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    
    public float area(){
    return this.lado1*this.lado2;
    }
    public float perimetro(){
    return this.lado1*4;
    }
    
}
