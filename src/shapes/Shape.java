
package shapes;

public class Shape {
    
    public double getLength(){
        return 0.0;
    }  
    public double getHeight(){
        return 0.0;
    }
    public double getExpansion () {
        return getLength() >= getHeight() ? getLength() : getHeight();
    } 
    public double getAreaSize(){
        return 0.0;
    }
}
