/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent a circle shape - as this is a circle it does not
 * contain any vertices
 */

public class Circle extends Shape2D {



    /**
     * Constructor for Circle shape object
     * @param centre The centre of the circle represented as a Point object
     * @param radius The radius of the circle created
     */
    public Circle(Point centre, double radius) {
        super(centre);

    }

    @Override
    public boolean containsPoint(Point point) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsPoint'");
    }

    @Override
    public Point[] getVertices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVertices'");
    }




}
