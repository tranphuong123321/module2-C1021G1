package bai_2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                ;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <i; j++) {
                        System.out.println("*");
                    }
                    System.out.println("");
                }
        }
    }
}
