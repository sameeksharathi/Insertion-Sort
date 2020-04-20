public class InsertionSort {
    public static void main(String[] args) {
        int j ;
        int k ;
        int arr[] = {40, 80, 20, 33, 77, 65};
        for(int i =1;i<arr.length;i++) {
            j = arr[i];
            k = i - 1;
            while (k >= 0 && arr[k] > j) {
                arr[k + 1] = arr[k];
                k = k - 1;
            }
            arr[k + 1] = j;
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
