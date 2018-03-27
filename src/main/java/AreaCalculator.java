import static java.lang.Math.abs;

public class AreaCalculator {


    public int calculateRectangleArea(int topRightX, int topRightY, int bottomLeftX, int bottomLeftY) {
        return abs(topRightX - bottomLeftX) * abs(topRightY - bottomLeftY);
    }

    public int calculateOverlap(int topRightX, int topRightY, int bottomLeftX, int bottomLeftY,
                                int topRightX2, int topRightY2, int bottomLeftX2, int bottomLeftY2) {
        int commonPartTopRightX;
        int commonPartTopRightY;
        int commonPartBottomLeftX;
        int commonPartBottomLeftY;

        if(topRightX < bottomLeftX2 || bottomLeftX > topRightX2) {
            return 0;
        }

        if(bottomLeftX > bottomLeftX2) {
            commonPartBottomLeftX = bottomLeftX;
        }
        else {
            commonPartBottomLeftX = bottomLeftX2;
        }
        if(bottomLeftY > bottomLeftY2) {
            commonPartBottomLeftY = bottomLeftY;
        }
        else {
            commonPartBottomLeftY = bottomLeftY2;
        }

        if(topRightX < topRightX2) {
            commonPartTopRightX = topRightX;
        }
        else {
            commonPartTopRightX = topRightX2;
        }
        if(topRightY < topRightY2) {
            commonPartTopRightY = topRightY;
        }
        else {
            commonPartTopRightY = topRightY2;
        }
        return calculateRectangleArea(commonPartBottomLeftX, commonPartBottomLeftY, commonPartTopRightX, commonPartTopRightY);
    }
}
