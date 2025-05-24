public class Pascal {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
