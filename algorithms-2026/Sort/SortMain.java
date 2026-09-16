package Sort;

import Sort.basic.InsertionSort;
import Sort.basic.SelectionSort;

public class SortMain {
    static void main(String[] args) {

        int[] intList = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 15 };

        SelectionSort selectionSorter = new SelectionSort();
        BubbleSort bubbleSorter = new BubbleSort();
        InsertionSort insertionSorter = new InsertionSort();
     
        selectionSorter.sort(intList);
      

        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + " ");
        }
    }
}