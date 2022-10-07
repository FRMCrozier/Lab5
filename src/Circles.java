import java.util.Arrays;

public class Circles {
    private Circle[] circles;

    public Circle[] getCircles() {
        return circles;
    }

   /* public void setCircles(int i, Circle circle)
    {
        circles[i] = circle;
    } */

    public Circles() {
        this.circles = new Circle[0];
    }
   /* public Circles(int length) {
        this.circles = new Circle[length];
    }*/

    public void addCircle(Circle circle) {
        Circle[] temp = Arrays.copyOf(circles, circles.length + 1);
        temp[circles.length] = circle;
        circles = temp;
    }

    public String getMaxCircleSquare()
    {
        int max = 0;
        for (int i = 0; i < circles.length-1; i++) {
            if (circles[max].getSquare() < circles[i+1].getSquare())
                max = i+1;
        }
        return "Circle " + max + " with square " + circles[max].getSquare();
    }

    @Override
    public String toString() {
        return Arrays.toString(circles) + "\n";
    }
}
