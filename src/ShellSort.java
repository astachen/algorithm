import java.util.Arrays;

public class ShellSort {
    public static int[] sort(int[] arr) {
        int k = 1;
        //all steps
        for (int d = arr.length / 2; d > 0; d /= 2) {
            //all groups
            for (int i = d; i < arr.length; i++) {
                //all elements
                for (int j = i - d; j >= 0; j -= d) {
                    //swap
                    if (arr[j] > arr[j + d]) {
                        int temp = arr[j];
                        arr[j] = arr[j + d];
                        arr[j + d] = temp;
                    }
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] src = new int[] {2,3,4,1};
        int[] dest = ShellSort.sort(src);
        System.out.println(Arrays.toString(dest));
    }
}
