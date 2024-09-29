import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {

        ArrayList<Rectangle> Rectangles = new ArrayList<>();

        Rectangles.add(new Rectangle(3,2));
        Rectangles.add(new Rectangle(5,6));
        Rectangles.add(new Rectangle(2,2));
        Rectangles.add(new Rectangle(4,7));
        Rectangles.add(new Rectangle(1,1));
        Rectangles.add(new Rectangle(6,3));
        Rectangles.add(new Rectangle(2,4));
        Rectangles.add(new Rectangle(7,1));
        Rectangles.add(new Rectangle(5,2));
        Rectangles.add(new Rectangle(6,9));

        Filter bigRectangleFilter = new BigRectangleFilter();

        System.out.println("Rectangles with a perimeter greater than 10:");
        for (Rectangle R : Rectangles) {
            if (bigRectangleFilter.accept(R)) {
                System.out.println("Rectangle Width: " + R.width + ", Height = " + R.height + "Perimeter = " + (2 * (R.width + R.height)));
            }
        }
    }
}
