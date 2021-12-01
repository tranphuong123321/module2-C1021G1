package bai_1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("nhap USD: ");
        int USD=input.nextInt();
        int VND= USD*23000;
        System.out.println(USD+"USD"+"="+VND+"VND");
    }
}
