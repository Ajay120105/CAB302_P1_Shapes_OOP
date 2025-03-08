/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

public class Rectangle extends Shape2D {

    /**
     * Constructor for Rectangle shape object
     * @param centre The centre of the Rectangle represented as a Point object
     * @param width The width of rectangle
     * @param length The length of rectangle
     */
    public Rectangle(Point centre, double width, double length) {
        super(centre);

    }

    @Override
    public Point[] getVertices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVertices'");
    }

    @Override
    public boolean containsPoint(Point point) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsPoint'");
    }

}
