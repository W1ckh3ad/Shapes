package shapes;

public class Rectangle  extends Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        assert length > 0.0 && height > 0.0;
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", height=" + height + '}';
    }
    
     public double getExpansion() {
        return height >= length ? height : length;
    }
     
     public double getAreaSize() {
         return length * height;
     }
    
}
