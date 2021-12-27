package case_study.service.Impl;

import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Villa;
import case_study.service.HouseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseServiceImpl implements HouseService {
    static List<House> houseList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (House house : houseList) {
            System.out.println(house);
        }

    }

    @Override
    public void addNew() {
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
        houseList.add(house);

    }

    @Override
    public void edit() {
        System.out.println("nhap ten dich vu muon sua");
        String fixserviceName = scanner.nextLine();
        boolean check = false;
        for (Facility house : houseList) {
            System.out.println(house.getServiceName());
            if (house.getServiceName() == fixserviceName) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. usableArea");
                System.out.println("3. rentalCosts");
                System.out.println("4. maximumNumberOfPeople");
                System.out.println("5. rentalType");
                System.out.println("6. roomStandard");
                System.out.println("7. numberOfFloors");

                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua dien tich");
                        double fixUsableArea = scanner.nextDouble();
                        house.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 3: {
                        System.out.println("sua chi phi thue");
                        double fixUsableArea = scanner.nextDouble();
                        house.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 4: {
                        System.out.println("sua so luong");
                        int fixmaximumNumberOfPeople = scanner.nextInt();
                        house.setMaximumNumberOfPeople(fixmaximumNumberOfPeople);
                        break;
                    }
                    case 5: {
                        System.out.println("sua kieu thue");
                        String fixrentalType = scanner.nextLine();
                        house.setRentalType(fixrentalType);
                        break;
                    }
                    case 6: {
                        System.out.println("sua tieu chuan phong");
                        String fixroomStandard = scanner.nextLine();
                        ((House)house).setRoomStandard(fixroomStandard);
                        break;
                    }
                    case 7: {
                        System.out.println("sua so tang");
                        int fixnumberOfFloors = scanner.nextInt();
                        ((House)house).setNumberOfFloors(fixnumberOfFloors);
                        break;
                    }

                }
            }
        }
    }
}
