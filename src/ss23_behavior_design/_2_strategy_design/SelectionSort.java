package ss23_behavior_design._2_strategy_design;

import java.util.List;

public class SelectionSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("SelectionSort");
    }
}
