package com.testehan.sealesClasses;

public sealed class Rectangle extends Shape permits TransparentRectangle, FilledRectangle{

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");;
    }

    void calculateArea(){
        System.out.println("Calculating area of Rectangle");
    }
}
