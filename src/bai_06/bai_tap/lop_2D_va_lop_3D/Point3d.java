package bai_6.bai_tap.lop_2D_va_lop_3D;

public class Point3d extends Point2d {
    private float z=0.0f;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
      setX(x);
      setY(y);
      setZ(z);
    }
    public float[] getXYZ(){
        float[] arr = new float[]{getX(),getY(),z};
        return arr;
    }
}
