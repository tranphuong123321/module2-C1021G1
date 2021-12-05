package bai_3_mang_va_phuong_thuc_trong_java.bai_tap.them_phan_tu_vao_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays;
        int n;

        do {
            System.out.println("nhập kích thước mảng :");
            n = scanner.nextInt();
        } while (n > 10);
        arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("nhập vào phần tử thứ " + i);
            arrays[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }

        System.out.println("nhập số cần chèn ");
        int X = scanner.nextInt();
        System.out.println("nhập vị trí cần chèn ");
        int index = scanner.nextInt();


        arrays = Arrays.copyOf(arrays,n+1);

        for (int i = n - 1; i >= index; i--) {
            arrays[i+1] = arrays[i];
        }
        arrays[index] = X;
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
    }
}

