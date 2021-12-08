package bai_6.bai_tap.lop_point_movepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }
    public float[] getXY() {
        float[] arr = new float[]{x, y};
        return arr;
    }
}
