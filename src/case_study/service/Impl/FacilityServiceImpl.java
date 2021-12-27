package case_study.service.Impl;

import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Room;
import case_study.service.FacilityService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static List<Facility> facilityList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Facility facility : facilityList) {
            System.out.println(facilityList);
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
        scanner.skip("\\R");
        System.out.println("nhap kieu thue");
        String rentalType = scanner.nextLine();

        Facility facility = new Facility(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        facilityList.add(facility);

    }

    @Override
    public void edit() {
        System.out.println("nhap ten dich vu muon sua");
        String fixserviceName = scanner.nextLine();
        boolean check = false;
        for (Facility facility : facilityList) {
            System.out.println(facility.getServiceName());
            if (facility.getServiceName() == fixserviceName) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. usableArea");
                System.out.println("3. rentalCosts");
                System.out.println("4. maximumNumberOfPeople");
                System.out.println("5. rentalType");

                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua dien tich");
                        double fixUsableArea = scanner.nextDouble();
                        facility.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 3: {
                        System.out.println("sua chi phi thue");
                        double fixUsableArea = scanner.nextDouble();
                        facility.setUsableArea(fixUsableArea);
                        break;
                    }
                    case 4: {
                        System.out.println("sua so luong");
                        int fixmaximumNumberOfPeople = scanner.nextInt();
                        facility.setMaximumNumberOfPeople(fixmaximumNumberOfPeople);
                        break;
                    }
                    case 5: {
                        System.out.println("sua kieu thue");
                        String fixrentalType = scanner.nextLine();
                        facility.setRentalType(fixrentalType);
                        break;
                    }
                }
            }
        }
    }
}
