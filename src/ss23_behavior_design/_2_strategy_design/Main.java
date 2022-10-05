package ss23_behavior_design._2_strategy_design;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.setSortStrategy(new MergeSort());
        sortedList.setSortStrategy(new SelectionSort());
        sortedList.sort();
    }
}
