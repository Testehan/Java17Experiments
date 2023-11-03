package com.testehan.sealesClasses;

public class App 
{
    public static void main( String[] args )
    {
        var circle = new Circle();
        circle.draw();

        var square = new Square();
        square.draw();

        var rectangle = new Rectangle();
        rectangle.draw();

        var filledRectangle = new FilledRectangle();
        filledRectangle.draw();

        var transparentRectangle = new TransparentRectangle();
        transparentRectangle.draw();

        var weirdShape = new WeirdShape();
        weirdShape.draw();

        var weirdCircle = new WeirdCircle();
        weirdCircle.draw();


    }
}
