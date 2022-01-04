package thi_thu.service.Impl;

import case_study.models.Customer;
import thi_thu.models.Student;
import thi_thu.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentService implements IStudentService {
    static List<Student> studentsList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void addNew() {
        System.out.println("nhap id");
        int id = scanner.nextInt();
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap ngay sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhap gioi tinh");
        System.out.println("1. Nam.");
        System.out.println("2. Nữ");
        String gender = "";
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nữ";
                break;

        }


    }

    @Override
    public void delete() {

    }

    @Override
    public void displayList() {

    }

    @Override
    public void search() {
        System.out.println("nhap ten can tim");
        String name=scanner.nextLine();
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i=0; i<studentsList.size();i++){
            if(studentsList.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                arrayList.add(studentsList.get(i));
            }
        }
        if(arrayList.size()==0){
            System.out.println("khong co ten nay");
        }else{
            for(Student student : arrayList){
                System.out.println(student);
            }
        }

    }
}
