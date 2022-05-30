package belajar.praktikum;

abstract class Shape {
    
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    abstract float getArea();
}

class Triangle extends Shape {

    private float base;
    private float height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    @Override
    float getArea() {
        return 0.5f * base * height;
    }
    
}

class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    
    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    
}

public class Abstraction {
    public static void main(String[] args) {
        
        // membuat objek dari class Triangle
        Shape segitiga = new Triangle(4, 5);

        // membuat objek dari class Circle
        Shape lingkaran = new Circle(10);
        
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}