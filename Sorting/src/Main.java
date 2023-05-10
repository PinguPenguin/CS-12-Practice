import java.util.*;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Data Distribution (1-Random, 2-Nearly Sorted, 3-Reversed, 4-Few Unique): ");
        int select = sc.nextInt();

        switch (select) {
            case 1 -> {
                System.out.println("Random Distribution Picked!");
                for (int type = 1; type <= 5; type++) {
                    switch (type) {
                        case 1 -> System.out.println("Bubble Sort: ");
                        case 2 -> System.out.println("Selection Sort: ");
                        case 3 -> System.out.println("Insertion Sort: ");
                        case 4 -> System.out.println("Merge Sort: ");
                        case 5 -> System.out.println("Quick Sort: ");
                    }
                    for (int i = 10; i <= 100000; i = i * 10) {
                        for (int j = 0; j <= 10; j++) {
                            if (j != 0) sum += getTime(ArrayGen.randomizedArray(i), type);
                        }
                        sum = sum / 10;
                        System.out.println("Size " + i + ": " + sum);
                        sum = 0;
                    }
                }
            }
            case 2 -> {
                System.out.println("Nearly Sorted Distribution Picked!");
                for (int type = 1; type <= 5; type++) {
                    switch (type) {
                        case 1 -> System.out.println("Bubble Sort: ");
                        case 2 -> System.out.println("Selection Sort: ");
                        case 3 -> System.out.println("Insertion Sort: ");
                        case 4 -> System.out.println("Merge Sort: ");
                        case 5 -> System.out.println("Quick Sort: ");
                    }
                    for (int i = 10; i <= 100000; i = i * 10) {
                        for (int j = 0; j <= 10; j++) {
                            if (j != 0) sum += getTime(ArrayGen.nearlySortedArray(i), type);
                        }
                        sum = sum / 10;
                        System.out.println("Size " + i + ": " + sum);
                        sum = 0;
                    }
                }
            }
            case 3 -> {
                System.out.println("Reversed Distribution Picked!");
                for (int type = 1; type <= 5; type++) {
                    switch (type) {
                        case 1 -> System.out.println("Bubble Sort: ");
                        case 2 -> System.out.println("Selection Sort: ");
                        case 3 -> System.out.println("Insertion Sort: ");
                        case 4 -> System.out.println("Merge Sort: ");
                        case 5 -> System.out.println("Quick Sort: ");
                    }
                    for (int i = 10; i <= 100000; i = i * 10) {
                        for (int j = 0; j <= 10; j++) {
                            if (j != 0) sum += getTime(ArrayGen.reversedArray(i), type);
                        }
                        sum = sum / 10;
                        System.out.println("Size " + i + ": " + sum);
                        sum = 0;
                    }
                }
            }
            case 4 -> {
                System.out.println("Few Unique Distribution Picked!");
                for (int type = 1; type <= 5; type++) {
                    switch (type) {
                        case 1 -> System.out.println("Bubble Sort: ");
                        case 2 -> System.out.println("Selection Sort: ");
                        case 3 -> System.out.println("Insertion Sort: ");
                        case 4 -> System.out.println("Merge Sort: ");
                        case 5 -> System.out.println("Quick Sort: ");
                    }
                    for (int i = 10; i <= 100000; i = i * 10) {
                        for (int j = 0; j <= 10; j++) {
                            if (j != 0) sum += getTime(ArrayGen.fewUniqueArray(i), type);
                        }
                        sum = sum / 10;
                        System.out.println("Size " + i + ": " + sum);
                        sum = 0;
                    }
                }
            }
        }
    }

    public static long getTime(int[] arr, int type) {
        StopWatch watch = new StopWatch();
        watch.start();
        switch (type) {
            case 1:
                Sorts.bubbleSort(arr);
            case 2:
                Sorts.selectSort(arr);
            case 3:
                Sorts.insertSort(arr);
            case 4:
                Sorts.mergeSort(arr);
            case 5:
                Sorts.quickSort(arr);
        }
        watch.stop();
        return watch.getElapsedTime();
    }
}
