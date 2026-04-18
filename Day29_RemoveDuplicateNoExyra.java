public class RemoveDuplicatesNoExtra {
    public static void main(String[] args) {
        char[] arr = "programming".toCharArray();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (arr[i] == arr[j]) {
                   for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--; 
                } else {
                    j++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
