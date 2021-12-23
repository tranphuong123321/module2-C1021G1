package case_study.service.Impl;

import case_study.models.Employee;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList= new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee);
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

        System.out.println("Nhap trinh do: ");
        System.out.println("1. Trung Cấp.");
        System.out.println("2. Cao Đẳng");
        System.out.println("3. Đại Học");
        System.out.println("4. Sau đại Học");
        String level = "";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                level = "Trung cấp";
                break;
            case 2:
                level = "Cao Đẳng";
                break;
            case 3:
                level = "Đại học";
                break;
            case 4:
                level = "Sau đại Học";
                break;
        }

        System.out.println("Nhap vi tri: ");
        System.out.println("1. Lễ tân.");
        System.out.println("2. Phục vụ");
        System.out.println("3. Chuyên viên.");
        System.out.println("4. Giám sát");
        System.out.println("5. Quản lý");
        System.out.println("6. Giám đốc");
        String position = "";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                position = "Lễ tân";
                break;
            case 2:
                position = "Phục vụ";
                break;
            case 3:
                position = "Chuyên viên";
                break;
            case 4:
                position = "Giám sát";
                break;
            case 5:
                position = "Quản lý";
                break;
            case 6:
                position = "Giám đốc";
                break;
        }

        System.out.println("Nhap luong: ");
        int salary =scanner.nextInt();
        Employee employee = new Employee( id,  name, dateOfBirth,  sex,  idCard,  numberPhone, email,  level,  position,  salary);
        employeeList.add(employee);

    }

    @Override
    public void edit() {
        System.out.println("nhap vao id muon sua");
        int idedit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == idedit) {
                System.out.println("nhap ten muon sua");
                String editNameProduct = scanner.nextLine();
                employeeList.get(i).setName(editNameProduct);
                System.out.println("nhap gia muon sua");
                double editPriceProduct = Double.parseDouble(scanner.nextLine());
                employeeList.get(i).setPrice(editPriceProduct);
            } else {
                System.out.println("khong co san pham nay");
            }
        }
        for (Product product : employeeList) {
            System.out.println(product);
        }

    }

    @Override
    public void delete() {

    }
}
