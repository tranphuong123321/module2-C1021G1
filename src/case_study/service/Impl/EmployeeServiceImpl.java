package case_study.service.Impl;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();
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
        int idCard = scanner.nextInt();
        System.out.println("Nhap sdt: ");
        int numberPhone = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap Email: ");
        String email = scanner.nextLine();
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
        int salary = scanner.nextInt();
        Employee employee = new Employee(id, name, dateOfBirth, sex, idCard, numberPhone, email, level, position, salary);
        employeeList.add(employee);

    }

    @Override
    public void edit() {
        System.out.println("Input your id");
        int fixid = scanner.nextInt();
        boolean check = false;
        for (Person employee : employeeList) {
            System.out.println(employee.getId());
            if (employee.getId() == fixid) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. name");
                System.out.println("3. dateOfBirth");
                System.out.println("4. sex");
                System.out.println("5. idCard");
                System.out.println("6. numberPhone");
                System.out.println("7. email");
                System.out.println("8. trinh do");
                System.out.println("9. vi tri");
                System.out.println("10. luong");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua ten");
                        String fixName = scanner.nextLine();
                        employee.setName(fixName);
                        break;
                    }
                    case 3: {
                        System.out.println("sua ngay sinh");
                        String fixDateOfBirth = scanner.nextLine();
                        employee.setDateOfBirth(fixDateOfBirth);
                        break;
                    }
                    case 4: {
                        System.out.println("sua gioi tinh");
                        String fixSex = scanner.nextLine();
                        employee.setSex(fixSex);
                        break;
                    }
                    case 5: {
                        System.out.println("sua cmnd");
                        int fixIdcard = scanner.nextInt();
                        employee.setIdCard(fixIdcard);
                        break;
                    }
                    case 6: {
                        System.out.println("sua sdt");
                        int fixNumberPhone = scanner.nextInt();
                        employee.setNumberPhone(fixNumberPhone);
                        break;
                    }
                    case 7: {
                        System.out.println("sua email");
                        String fixMail = scanner.nextLine();
                        employee.setEmail(fixMail);
                        break;
                    }
                    case 8: {
                        System.out.println("sua trinh do");
                        String fixLevel = scanner.nextLine();
                        ((Employee) employee).setLevel(fixLevel);
                        break;
                    }
                    case 9: {
                        System.out.println("sua vi tri");
                        String fixPosition = scanner.nextLine();
                        ((Employee) employee).setPosition(fixPosition);
                        break;
                    }
                    case 10: {
                        System.out.println("sua luong");
                        int fixSalary = scanner.nextInt();
                        ((Employee) employee).setSalary(fixSalary);
                        break;
                    }

                }
            } else if (!check) {
                System.out.println("ID not found!");
            }
        }
    }
}
