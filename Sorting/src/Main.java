public class Main {
    public static void main(String[] args) {
        ArrayGen gen = new ArrayGen();
        //naming is hard
        int[][] Arrays = new int[5][];

        Arrays[1] = ArrayGen.randomizedArray(10);
        Arrays[2] = ArrayGen.randomizedArray(100);
        Arrays[3] = ArrayGen.randomizedArray(1000);
        Arrays[4] = ArrayGen.randomizedArray(10000);
        Arrays[5] = ArrayGen.randomizedArray(100000);
        long sum = 0;
        //Bubble sort, randomized array (size 1000)
        for (int i = 0; i < 11; i++){
            if (i != 0) {
                sum += bubbleTime(ArrayThree);
            }
            ArrayThree = ArrayGen.randomizedArray(1000);
        }
        System.out.println((double) sum / 10);
    }

    public static long bubbleTime(int[] arr){
        StopWatch watch = new StopWatch();
        watch.start();
        Sorts.bubbleSort(arr);
        watch.stop();
        return watch.getElapsedTime();
    }
}
