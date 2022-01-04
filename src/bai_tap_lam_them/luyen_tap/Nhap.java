package bai_tap_lam_them.luyen_tap;

import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        boolean check = true;


        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("nhap so tu 1-3: ");
            int numBer =0;
            try {
                numBer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập lại");
            }
            if(numBer<1 || numBer>3){

                continue;
            }
            switch (numBer) {
                case 1:
                    System.out.println("A");

                    break;
                case 2:
                    System.out.println("B");

                    break;
                case 3:
                    System.out.println("C");

                    break;
            }
        }
    }
}
