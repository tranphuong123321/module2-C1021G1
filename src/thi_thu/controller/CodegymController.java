package thi_thu.controller;

import thi_thu.service.Impl.StudentService;

import java.util.Scanner;

public class CodegymController {
    StudentService studentService=new StudentService();
    public static void main(String[] args) {
        displayMainMenu();
    }

        public static void displayMainMenu () {
            boolean check = true;
            int choice = 0;
            while (check) {
                System.out.println("1. Thêm mới giảng viên hoặc học sinh");
                System.out.println("2. Xóa giảng viên hoặc học sinh");
                System.out.println("3. Xem danh sách giảng viên hoặc học sinh ");
                System.out.println("4. Tìm kiếm giảng viên hoặc học sinh");
                System.out.println("5. Thoát");


                Scanner scanner = new Scanner(System.in);
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException exception) {
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại");
                }
                switch (choice) {
                    case 1:
                        addNew();
                        break;
                }
            }
        }



    public static void addNew() {


    }
}

