public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 2, 6, 3, 4 };
        int temp[] = new int[arr.length];
        int k = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            flag = 0;
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i]);
        }
    }
}
