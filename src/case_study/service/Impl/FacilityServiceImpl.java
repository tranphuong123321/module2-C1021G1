package case_study.service.Impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private  static Map<Facility,Integer> facilityIntegerMap= new LinkedHashMap<>();
    private static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service"+element.getKey()+"So lan da thue"+element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
        

    }

    @Override
    public void addNewVilla() {
        System.out.println("nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        Double usableArea = scanner.nextDouble();
        System.out.println("nhap chi phi thue ");
        int rentalCosts = scanner.nextInt();
        System.out.println("nhap so luong nguoi toi da");
        int maximumNumberOfPeople = scanner.nextInt();
        scanner.skip("\\R");
        System.out.println("nhap kieu thue");
        String rentalType = scanner.nextLine();
        System.out.println("nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("nhap dien tich ho boi");
        double poolArea = scanner.nextDouble();
        System.out.println("nhap so tang");
        int numberOfFloors = scanner.nextInt();
        Villa villa = new Villa(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors);
        facilityIntegerMap.put(villa,0);
        System.out.println("da them moi thanh cong");
    }

    @Override
    public void addNewHouse() {
        System.out.println("nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("nhap dien tich su dung");
        Double usableArea = scanner.nextDouble();
        System.out.println("nhap chi phi thue ");
        int rentalCosts = scanner.nextInt();
        System.out.println("nhap so luong nguoi toi da");
        int maximumNumberOfPeople = scanner.nextInt();
        System.out.println("nhap kieu thue");
        String rentalType = scanner.nextLine();
        System.out.println("nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("nhap so tang");
        int numberOfFloors = scanner.nextInt();
        House house = new House(serviceName, usableArea, rentalCosts,maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        facilityIntegerMap.put(house,0);
        System.out.println("da them moi thanh cong");

    }

    @Override
    public void addNewRoom() {
        System.out.println("nhap ten dich vu");
        String serviceName = scanner.nextLine();

        System.out.println("nhap dien tich su dung");
        Double usableArea = scanner.nextDouble();
        System.out.println("nhap chi phi thue ");
        int rentalCosts = scanner.nextInt();
        System.out.println("nhap so luong nguoi toi da");
        int maximumNumberOfPeople = scanner.nextInt();
        System.out.println("nhap kieu thue");
        String rentalType = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhap dich vu mien phi di kem");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,freeServiceIncluded);
        facilityIntegerMap.put(room,0);
        System.out.println("da them moi thanh cong");

    }
}
