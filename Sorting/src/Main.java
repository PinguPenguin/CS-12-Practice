public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble sort with ");
        for (int i = 0; i < 11; i++){
            int[] Array = ArrayGen.randomizedArray(i * 10);
            System.out.println(bubbleTime(Array));
        }
    }
    public static long bubbleTime(int[] arr){
        StopWatch watch = new StopWatch();
        watch.start();
        Sorts.bubbleSort(arr);
        watch.stop();
        return watch.getElapsedTime();
    }
}
