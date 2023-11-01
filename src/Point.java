public class Point {

    private int x;
    private int y;
    private String c;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int x) {
        this.x = x;
        y = x;
    }
    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }
    public String quadrant() {
        if (x == 0 || y == 0) {
            if (x == 0 && y == 0) {
                c = "origin";
            } else {
                c = "on an axis";
            }
        }
        if (x > 0) {
            if (y > 0) {
                c = "I";
            }
            if (y < 0) {
                c = "IV";
            }

        }
        if (x < 0) {
            if (y > 0) {
                c = "II";
            }
            if (y < 0) {
                c = "III";
            }
        }
        return c;
    }
}
