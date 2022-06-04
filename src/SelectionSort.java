public class SelectionSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                //select the minimum number in the unsorted array
                if(array[j] < array[minIndex] ) {
                    minIndex = j;

                }
            }
            // swap the array[minIndex] and array[i],if the array[i] is the smallest then don't change
            if (minIndex != i) {
                int temp = array[i]; array[i] = array[minIndex]; array[minIndex] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] src = {8, 4, 6, 2, 1, 7, 3, 9, 5};
        int[] dest = SelectionSort.sort(src);
        for (int num : dest) {
            System.out.print(num + "\t");
        }
    }
}
