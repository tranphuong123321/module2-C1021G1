package bai_6.bai_tap.lop_2D_va_lop_3D;

public class Test2d {
    public static void main(String[] args) {
        Point2d point2d=new Point2d(3,4);
        Point3d test =new Point3d(3,4,5);
        point2d.setXY(8,9);
        test.setXYZ(3,4,5);
        float arr[] = test.getXYZ();
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
