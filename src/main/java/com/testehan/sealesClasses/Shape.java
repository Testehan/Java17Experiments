package com.testehan.sealesClasses;

public abstract sealed class Shape permits Circle,Square,Rectangle,WeirdShape{

    void draw(){
    };
}
