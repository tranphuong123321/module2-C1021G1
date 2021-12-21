package case_study.task_2.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2: {
                    displayCustomerMenu();
                    break;
                }
                case 3: {
                    displayFacilityManagementMenu();
                    break;
                }
                case 4: {
                    displayBookingManagermentMenu();
                    break;
                }
                case 5: {
                    displayPromotionManagementMenu();
                    break;
                }
                case 6: {
                    break;
                }
                default:
                    System.out.println("nhap lai");
            }
        }
    }

    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Back to main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 4:
                    displayMainMenu();
                    break;

            }
        }
    }

    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Back to main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 2: {
                    displayCustomerMenu();
                    break;
                }
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayFacilityManagementMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Back to main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 3: {
                    displayFacilityManagementMenu();
                    break;
                }
                case 4:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayBookingManagermentMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list constracts");
            System.out.println("5. Edit constracts");
            System.out.println("6. Back to main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 4: {
                    displayBookingManagermentMenu();
                    break;
                }
                case 6:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayPromotionManagementMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Back to main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 5: {
                    displayPromotionManagementMenu();
                    break;
                }
                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }


}
