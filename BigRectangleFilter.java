import java.awt.*;

public class BigRectangleFilter implements Filter{

    @Override
    public boolean accept(Object x){
        if (x instanceof Rectangle){
            Rectangle R = (Rectangle)x;
            int perimeter = 2 * (R.width + R.height);
            return perimeter > 10;
        }
        return false;
    }
}
