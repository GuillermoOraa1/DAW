/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioRectangulo;

/**
 *
 * @author DAW
 */
public class Rectangulo {
    
    private int x1,y1,x2,y2;
    private double perimetro;
    private double area;
    static final int min=0;
    static final int max=100;
    static int[] arraybis=new int[3];

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if ((x1<x2)&&(y1<y2) &&(x1>min)&&(y1>min)&&(x2<max)&&(y2<max)) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.setPerimetro();
        this.setArea();
        }else{
            System.err.println("ERROR al instanciar Rectangulo");
        }   
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (this.x1>x2) {
          System.err.println("ERROR esto es un error");
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
         if (this.y1>y2) {
          System.err.println("ERROR esto es un error");
        }else{
          this.y2 = y2;
        }
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro() {
        this.perimetro = (x2-x1)*2+(y2-y1)*2;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = (x2-x1)*(y2-y1);
    }
    
    public String imprimir() {
        return "El perimetro es " + perimetro + ", el area es " + area + '}';
    }
    
    public void setX2Y2(int x2,int y2) {
        if (this.x1>x2 && this.y1>y2) {
          System.err.println("ERROR esto es un error");
        }else{
          this.x2 = x2;
          this.y2 = y2;
        }
    }  
    
    public void setX1Y1(int x1,int y1) {
        if (this.x2<x1 && this.y2<y1) {
          System.err.println("ERROR esto es un error");
        }else{
          this.x1 = x1;
          this.y1 = y1;
        }
    } 
    
    public void setAll(int x1,int y1,int x2,int y2) {
        if (this.x2<x1 && this.y2<y1) {
          System.err.println("ERROR esto es un error");
        }else{      
          this.x1 = x1;
          this.y1 = y1;
          this.x2 = x2;
          this.y2 = y2;
        }
    } 
}
