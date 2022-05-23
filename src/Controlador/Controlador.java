/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Triangulo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author IFRODRIGUERO
 */
public class Controlador {
    
    public static void inicio(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Elija la opcion:");
        System.out.println("1. Perimetro mayor");
        System.out.println("2. Tipo de Triangulo");
        int op = sc.nextInt();
        if (op ==1){
        perimetroMayor();
        }else if(op==2){
        tipoTriangulo();
        }
        
    }
    
    public static void perimetroMayor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cantidad de figuras:");
        int leng=sc.nextInt();
        String [] array= new String[leng];
        System.out.println("Digite los parametros de la figura");
        System.out.println("Formato:lado1,lado2");
        float perimetro;
         List<Float> list = new ArrayList<Float>();
        for(int i=0; i<leng; i++ ) {
         array[i] = sc.next();
            String [] aux=array[i].split(",");
         if (aux.length==1){
             Circulo circulo=new Circulo(Float.parseFloat(aux[0]));
             list.add(circulo.perimetro());
         }else if (aux.length==3){
             List<Float> list2 = new ArrayList<Float>();
              Float[] aux2=new Float[aux.length];
           for (int j = 0; j < aux.length; j++) {
               list2.add(Float.parseFloat(aux[j]));
           }   
          Collections.sort(list2);
             Triangulo triangulo=new Triangulo(list2.get(1), list2.get(2), list2.get(0));
             String tipo=triangulo.tipoDeTriangulo();
             if (tipo.equalsIgnoreCase("Equilatero")){
             list.add(triangulo.perimetroEquilatero());
             }else if (tipo.equalsIgnoreCase("Isosceles")){
             list.add(triangulo.perimetroIsosceles());
             }else if (tipo.equalsIgnoreCase("Escaleno")){
             list.add(triangulo.perimetroEscaleno());
             }
         }else if (aux.length==4){
             Cuadrado cuadrado=new Cuadrado(Float.parseFloat(aux[0]), Float.parseFloat(aux[1]), Float.parseFloat(aux[2]), Float.parseFloat(aux[3]));
             list.add(cuadrado.perimetro());
         }
      }
        Collections.sort(list);
          int index = list.size() - 2;
        for (int i = 0; i < list.size(); i++) {
            System.out.println("El perimetro mayor es: " + list.get(i));
        }
         System.out.println("El perimetro mayor es: " + list.get(index+1));
    }
    
    public static void tipoTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cantidad de triangulos:");
        int leng=sc.nextInt();
        String [] array= new String[leng];
        System.out.println("Digite los parametros de la figura");
        System.out.println("Formato:lado1,lado2");
         List<Float> list = new ArrayList<Float>();
        for(int i=0; i<leng; i++ ) {
         array[i] = sc.next();
            String [] aux=array[i].split(",");
            Float[] aux2=new Float[aux.length];
             Triangulo triangulo=new Triangulo(Float.parseFloat(aux[1]), Float.parseFloat(aux[2]), Float.parseFloat(aux[0]));
             String tipo=triangulo.tipoDeTriangulo();
          System.out.println("El triangulo: " + array[i]+ " es: "+ tipo);
      }
        
    }
           
            
    
}
