package bai_5_access_modifier.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(){

    }
    Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double area;
        area = getRadius()*Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class Demo{

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.getRadius();
        circle.getArea();
        System.out.println(circle.getArea());
    }
}

