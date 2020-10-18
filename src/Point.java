public class Point {
    private int x;
    private int y;
    private String quadrant;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String whatQuarter() {
        if (x > 0  && y > 0)
            return "I";
        else if (x > 0 && y < 0)
            return "IV";
        else if (x < 0 && y < 0)
            return "III";
        else
            return "II";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point ("+ x + ", " + y +") is in the " + whatQuarter() + " quadrant." ;
    }
}
