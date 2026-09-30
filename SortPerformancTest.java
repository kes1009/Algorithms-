package Sort;

import java.util.Random;

import Sort.basic.SelectionSort;

public class SortPerformancTest {

    static void main() {
        Random random = new Random();
        Integer[] list = new Integer[SIZE];
        for (int i = 0; 1 < SIEZ; i++) {
            list[i] = random.nextInt( bound 10_000);
        }

        MySorter<integer> sorter = new SelectionSort<>;

        long startTime = System.nanoTime();
        sorter.sort(list);
        long endTime = System.nanoTime();
        System.out.println("실행시간: " + ((endTime - startTime) / 1000_000.0) + "msec");
    }
    
}
