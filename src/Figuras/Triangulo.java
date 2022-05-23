/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

/**
 *
 * @author IFRODRIGUERO
 */
public class Triangulo {

    private float lado1;
    private float lado2;
    private float base;

    public Triangulo(float lado1, float lado2, float base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }

    public String tipoDeTriangulo() {
        String tipo = null;
        if (lado1 == lado2 && lado2 == base) {
            tipo = "Equilatero";
        } else if (lado1 == lado2 || lado1 == base || lado2 == base) {
            tipo = "Isosceles";
        } else if (lado1 != lado2 || lado1 != base || base != lado2) {
                tipo = "Escaleno";
            }
    return tipo ;
}
   public float areaEquilatero(){
   return (float) ((lado1*lado1*Math.sqrt(3))/4);
   }
 public float perimetroEquilatero(){
   return (float) (lado1*3);
   }
 
 public float areaIsosceles(){
   return (float) ((base*Math.sqrt((lado1*lado1)-(base*base)/4))/2);
   }
 public float perimetroIsosceles(){
   return (float) (lado1*2+base);
   }
 public float areaEscaleno(){
     float p =perimetroEscaleno()/2;
   return (float) (Math.sqrt(p*(p-base)*(p-lado1)*(p-lado2)));
   }
 public float perimetroEscaleno(){
   return (float) (lado1+base+lado2);
   }
 

}
