package case_study.service.impl;

import case_study.models.Employee;
import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void display() {

    }

    public void addNew() {
        System.out.println("Nhập id: ");
        Scanner scanner = null;
        String id = scanner.nextLine();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        String age = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();

        System.out.println("Nhập chứng minh: ");
        String idCard = scanner.nextLine();

        System.out.println("Nhập email: ");
        String email = scanner.nextLine();

        System.out.println("Nhập chức vụ: ");
        String level = scanner.nextLine();

        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();

        System.out.println("Nhập lương: ");
        String salary = scanner.nextLine();
        Employee[] employeeList= new Employee();
        Employee employee = new Employee(id, name, age, sex, idCard, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
