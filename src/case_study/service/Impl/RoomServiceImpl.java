package case_study.service.Impl;

import case_study.models.*;
import case_study.service.RoomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomServiceImpl implements RoomService {
    static List<Room> roomList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Room room : roomList) {
            System.out.println(room);
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
        System.out.println("nhap dich vu mien phi di kem");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,freeServiceIncluded);
        roomList.add(room);

    }

    @Override
    public void edit() {
        System.out.println("nhap ten dich vu muon sua");
        String fixserviceName = scanner.nextLine();
        boolean check = false;
        for (Facility room : roomList) {
            System.out.println(room.getServiceName());
            if (room.getServiceName() == fixserviceName) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. usableArea");
                System.out.println("3. rentalCosts");
                System.out.println("4. maximumNumberOfPeople");
                System.out.println("5. rentalType");
                System.out.println("6. freeServiceIncluded");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua dien tich");
                        double fixUsableArea = scanner.nextDouble();
                        room.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 3: {
                        System.out.println("sua chi phi thue");
                        double fixUsableArea = scanner.nextDouble();
                        room.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 4: {
                        System.out.println("sua so luong");
                        int fixmaximumNumberOfPeople = scanner.nextInt();
                        room.setMaximumNumberOfPeople(fixmaximumNumberOfPeople);
                        break;
                    }
                    case 5: {
                        System.out.println("sua kieu thue");
                        String fixrentalType = scanner.nextLine();
                        room.setRentalType(fixrentalType);
                        break;
                    }
                    case 6: {
                        System.out.println("sua dich vu di kem");
                        String fixfreeServiceIncluded = scanner.nextLine();
                        ((Room) room).setFreeServiceIncluded(fixfreeServiceIncluded);
                        break;
                    }

                }
            }
        }
    }
}