package bai_7.bai_tap.trien_khai_interface_colorable;

public class Square extends Shape implements Colorable{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){

    }
    public Square(double side){
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides: "+getColor());
    }
}
