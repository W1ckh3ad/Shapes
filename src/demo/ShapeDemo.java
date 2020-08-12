package demo;

import shapes.*;

public class ShapeDemo {

        public static void main(String[] args) {

                Point point = new Point();
                System.out.println(point
                        + ": length = " + point.getLength()
                        + ", height = " + point.getHeight()
                        + ", expansion = " + point.getExpansion()
                        + ", area size = " + point.getAreaSize()
                );
                System.out.println();
                
                Line line = new Line(7.5);
                System.out.println(line
                        + ": length = " + line.getLength()
                        + ", height = " + line.getHeight()
                        + ", expansion = " + line.getExpansion()
                        + ", area size = " + line.getAreaSize()
                );
                System.out.println();
                
            /*    Square square = new Square(6.0);
                System.out.println(square
                        + ": length = " + square.getLength()
                        + ", height = " + square.getHeight()
                        + ", expansion = " + square.getExpansion()
                        + ", area size = " + square.getAreaSize()
                );
                System.out.println();*/
                
                Rectangle rectangle = new Rectangle(3.5, 4.0);
                System.out.println(rectangle
                        + ": length = " + rectangle.getLength()
                        + ", height = " + rectangle.getHeight()
                        + ", expansion = " + rectangle.getExpansion()
                        + ", area size = " + rectangle.getAreaSize()
                );
                System.out.println();
                
            /*     Circle circle = new Circle(5.6);
                System.out.println(circle
                        + ": length = " + circle.getLength()
                        + ", height = " + circle.getHeight()
                        + ", expansion = " + circle.getExpansion()
                        + ", area size = " + circle.getAreaSize()
                );
                System.out.println();*/
                
                Ellipse ellipse = new Ellipse(2.0, 3.0);
                System.out.println(ellipse
                        + ": length = " + ellipse.getLength()
                        + ", height = " + ellipse.getHeight()
                        + ", expansion = " + ellipse.getExpansion()
                        + ", area size = " + ellipse.getAreaSize()
                );
                System.out.println();
                
        Shape shape = new Shape();
                System.out.println(shape
                        + ": length = " + shape.getLength()
                        + ", height = " + shape.getHeight()
                        + ", expansion = " + shape.getExpansion()
                        + ", area size = " + shape.getAreaSize()
                );
        }
}
