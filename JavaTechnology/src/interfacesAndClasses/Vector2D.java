package interfacesAndClasses;

public class Vector2D {
    double x, y;

    Vector2D() {
        x = 0;
        y = 0;
    }

    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {

        return ("x = " + String.valueOf(x) + "\ny = " + String.valueOf(y));
    }

}
