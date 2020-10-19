public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String whatQuarter() {
        if (x == 0 && y ==0)
            return "0";
        else if (x > 0  && y > 0)
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
        if (whatQuarter() == "0")
            return "Point ("+ x + ", " + y +") is at the origin of the coordinate system.";
        else
        return "Point ("+ x + ", " + y +") is in the " + whatQuarter() + " quadrant." ;
    }
}
