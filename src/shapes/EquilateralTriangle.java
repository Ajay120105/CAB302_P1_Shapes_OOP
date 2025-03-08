/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent an Equilateral Triangle shape - contains 3 sides of equal length and
 * contains 3 vertices
 */

public class EquilateralTriangle  extends Shape2D {
    
    /**
    * Constructor for Equilateral Triangle  shape object
    * @param centre The centre of the Equilateral Triangle represented as a Point object
    * @param sideLength The length of each side (all same as equilateral)
    */
    public EquilateralTriangle(Point centre, double sideLength) {
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
