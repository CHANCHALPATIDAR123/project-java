public class AddArray {
    public static void main(String args[]) {
        int arr1[] = { 3, 5, 6, 8 };
        int arr2[] = { 2, 9, 4, 7 };
        int p = arr1.length + arr2.length;
        int arr3[] = new int[p];
        int k = 0;
        int j = 0;
        for (int i = 0; i < p; i++) {
            if (i % 2 == 0) {
                arr3[i] = arr1[j];
                j++;
            } else {
                arr3[i] = arr2[k];
                k++;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
