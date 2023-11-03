package com.testehan.sealesClasses;

public non-sealed class WeirdShape extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing a weird shape");
    }

    void randomMethod(){
        System.out.println("Called randomMethod from WeirdShape");
    }
}
