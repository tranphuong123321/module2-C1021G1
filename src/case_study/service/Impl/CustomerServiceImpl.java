package case_study.service.Impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList= new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer : customerList){
            System.out.println(customer);
        }

    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name =scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String dateOfBirth =scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        System.out.println("1. Nam.");
        System.out.println("2. Nữ");
        System.out.println("3. LGBT");
        String sex = "";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                sex = "Nam";
                break;
            case 2:
                sex = "Nữ";
                break;
            case 3:
                sex = "LGBT";
                break;
        }

        System.out.println("Nhap chung minh: ");
        int idCard =scanner.nextInt();
        System.out.println("Nhap sdt: ");
        int numberPhone =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Email: ");
        String email =scanner.nextLine();
        System.out.println("Nhap loai khach: ");
        System.out.println("1. Diamond.");
        System.out.println("2. Platinium");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        String type = "";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                type = "Diamond";
                break;
            case 2:
                type = "Platinium";
                break;
            case 3:
                type = "Gold";
                break;
            case 4:
                type = "Silver";
                break;
            case 5:
                type = "Member";
                break;
        }

        System.out.println("Nhap dia chi: ");
        String address =scanner.nextLine();
        Customer customer = new Customer( id,  name, dateOfBirth,  sex,  idCard,  numberPhone, email,  type,  address);
        customerList.add(customer);


    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
