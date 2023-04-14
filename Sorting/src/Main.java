public class Main {
    public static void main(String[] args) {
        ArrayGen gen = new ArrayGen();
        //naming is hard
        int[] ArrayOne = ArrayGen.randomizedArray(10);
        int[] ArrayTwo = ArrayGen.randomizedArray(100);
        int[] ArrayThree = ArrayGen.randomizedArray(1000);
        int[] ArrayFour = ArrayGen.randomizedArray(10000);
        int[] ArrayFive = ArrayGen.randomizedArray(100000);
        for (int i = 0; i < 11; i++){
            System.out.println(bubbleTime(ArrayThree));
            ArrayThree = ArrayGen.randomizedArray(1000);
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
