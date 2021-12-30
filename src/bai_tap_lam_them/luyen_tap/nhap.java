package bai_tap_lam_them.luyen_tap;

import java.util.Scanner;

public class nhap {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        int n = 0;

        System.out.print("Nhap so nguyen: ");
        while (true) {
            try {
                str = scanner.nextLine();
                n = Integer.parseInt(str);
                System.out.println("So ban nhap la: " + n);
                break;
            } catch (Exception ex) {
                System.out.print(str + ": khong phai so nguyen!");
                System.out.print(" Nhap lại: ");
            }
        }
    }
}
