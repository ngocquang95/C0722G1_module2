package ss23_behavior_design._2_strategy_design;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    List<String> items = new ArrayList<>();

    public void sort() {
        sortStrategy.sort(items);
    }
}
