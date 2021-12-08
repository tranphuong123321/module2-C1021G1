package bai_6.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color) {
        super(radius, color);
    }
    public Cylinder(double height, String color, double radius){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getRadius()*getRadius()*Math.PI*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                super.toString()+
                '}';
    }
}
