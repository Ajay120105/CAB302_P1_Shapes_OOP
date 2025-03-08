/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Shape2D is an Abstract Class and acts as a base class for all the 2D shapes
 * which includes Equilateral Triangle, Circle, Rectangle amd Square.
 * Shape2D is a shared common ancestor between the shape classes as each of these classes subclass
 * Shape2D
 */
public abstract class Shape2D {


    public Shape2D(Point centre) {

    }

    public void translate(double xCord, double yCord) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'translate'");
    }

    public abstract boolean containsPoint(Point point);

    public abstract Point[] getVertices();

    public Object getArea() {
        return 0.0F;
    }

    public Object getPerimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
    }
}
