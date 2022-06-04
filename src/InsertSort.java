public class InsertSort {
    //这是一种交换和比较都很多的方法
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j]; array[j] = array[j - 1]; array[j - 1] = temp;
                j--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] src = {8, 4, 6, 2, 5, 7, 3, 9, 1};
        int[] dest = InsertSort.sort(src);
        for (int num : dest) {
            System.out.print(num + "\t");
        }
    }
}
