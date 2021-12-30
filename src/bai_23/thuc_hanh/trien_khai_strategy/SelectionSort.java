package bai_23.thuc_hanh.trien_khai_strategy;

import java.util.List;

public class SelectionSort implements SortStrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
