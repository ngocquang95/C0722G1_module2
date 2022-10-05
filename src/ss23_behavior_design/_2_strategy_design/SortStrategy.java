package ss23_behavior_design._2_strategy_design;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
