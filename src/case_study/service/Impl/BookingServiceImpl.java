package case_study.service.Impl;

import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.service.BookingService;
import case_study.service.FacilityService;
import case_study.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer())
    }




