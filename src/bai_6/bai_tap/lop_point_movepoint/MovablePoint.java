package bai_6.bai_tap.lop_point_movepoint;

public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MovablePoint(float x,float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint( float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        float[] arr =new float[]{xSpeed,ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                super.toString()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){

        return this;
    }
}
