package case_study.service.Impl;

import case_study.models.*;
import case_study.service.VillaService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaServiceImpl implements VillaService {
    static List<Villa> villaList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Villa villa : villaList) {
            System.out.println(villa);
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
        System.out.println("nhap dien tich ho boi");
        double poolArea = scanner.nextDouble();
        System.out.println("nhap so tang");
        int numberOfFloors = scanner.nextInt();
        Villa villa = new Villa(serviceName,usableArea,rentalCosts,maximumNumberOfPeople,rentalType,roomStandard,poolArea,numberOfFloors);
        villaList.add(villa);

    }

    @Override
    public void edit() {
        System.out.println("nhap ten dich vu muon sua");
        String fixserviceName = scanner.nextLine();
        boolean check = false;
        for (Facility villa : villaList) {
            System.out.println(villa.getServiceName());
            if (villa.getServiceName() == fixserviceName) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. usableArea");
                System.out.println("3. rentalCosts");
                System.out.println("4. maximumNumberOfPeople");
                System.out.println("5. rentalType");
                System.out.println("6. roomStandard");
                System.out.println("7. poolArea");
                System.out.println("8. numberOfFloors");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua dien tich");
                        double fixUsableArea = scanner.nextDouble();
                        villa.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 3: {
                        System.out.println("sua chi phi thue");
                        double fixUsableArea = scanner.nextDouble();
                        villa.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 4: {
                        System.out.println("sua so luong");
                        int fixmaximumNumberOfPeople = scanner.nextInt();
                        villa.setMaximumNumberOfPeople(fixmaximumNumberOfPeople);
                        break;
                    }
                    case 5: {
                        System.out.println("sua kieu thue");
                        String fixrentalType = scanner.nextLine();
                        villa.setRentalType(fixrentalType);
                        break;
                    }
                    case 6: {
                        System.out.println("tieu chuan phong");
                        String fixroomStandard = scanner.nextLine();
                        villa.setRentalType(fixroomStandard);
                        break;
                    }
                    case 7: {
                        System.out.println("sua dien tich ho boi");
                        double fixpoolArea = scanner.nextDouble();
                        ((Villa) villa).setPoolArea(fixpoolArea);
                        break;
                    }
                    case 8: {
                        System.out.println("sua so tang");
                        int fixnumberOfFloors = scanner.nextInt();
                        ((Villa) villa).setNumberOfFloors(fixnumberOfFloors);
                        break;
                    }

                }
            }
        }
    }
}
