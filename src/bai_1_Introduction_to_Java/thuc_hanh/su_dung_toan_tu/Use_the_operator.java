package bai_1_Introduction_to_Java.thuc_hanh.su_dung_toan_tu;

import java.util.Scanner;
public class Use_the_operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter width");
        width = scanner.nextFloat();
        System.out.println("Enter height");
        height=scanner.nextFloat();
        float area = width*height;
        System.out.println("Area is "+area);
    }
}
