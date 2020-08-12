
package shapes;


public class Ellipse  extends Shape {
    private double semiHorizontalAxis;
    private double semiVerticalAxis;

    public Ellipse(double semiHorizontalAxis, double semiVerticalAxis) {
        this.semiHorizontalAxis = semiHorizontalAxis;
        this.semiVerticalAxis = semiVerticalAxis;
    }

    public double getSemiHorizontalAxis() {
        return semiHorizontalAxis;
    }

    public double getSemiVerticalAxis() {
        return semiVerticalAxis;
    }

    @Override
    public String toString() {
        return "Ellipse{" + "semiHorizontalAxis=" + semiHorizontalAxis + ", semiVerticalAxis=" + semiVerticalAxis + '}';
    }
    
    public double getLength() {
        return 2.0 * semiHorizontalAxis;
    }
    
     public double getHeight() {
        return 2.0 * semiVerticalAxis;
    }
    
    public double getAreaSize() {
        return Math.PI * semiHorizontalAxis * semiVerticalAxis;
    }
}
