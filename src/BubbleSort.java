
public class BubbleSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] src = {8, 4, 6, 2, 5, 7, 3, 9, 1};
        int[] dest = BubbleSort.sort(src);
        for (int num : dest) {
            System.out.print(num + "\t");
        }
    }
}
