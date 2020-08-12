
package shapes;

public class Line  extends Shape {
    private double length;

    public Line(double length) {
        assert length > 0.0;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Line{" + "length=" + length + '}';
    }
    
    /*public double getHeight() {
        return 0.0;
    }
    
    public double getAreaSize() {
        return 0.0;
    }*/
}
