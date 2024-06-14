import java.util.Arrays;

public class flightbookings {
    public static void main(String[] args) {
        int[][] bookings = {
                {1,2,10},
                {2,3,20},
                {2,5,25}
        };
        int n = 5;
        int[][] arr = newarr(bookings, n );

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        int[] sum = add(arr, n);
        for (int i = 0; i < sum.length; i++){
            System.out.println(sum[i]);
        }

//        int[] result = add(arr, n);
//        System.out.println(Arrays.toString(arr));
    }
    static int[][] newarr(int[][] bookings, int n){
        int a = bookings.length;
        int[][] arr = new int[a][n];

        for (int i = 0; i < a; i++) {
            int start = bookings[i][0];
            int end = bookings[i][1];
            int value = bookings[i][2];

            arr = appArray(arr, i, start, end, value);
        }
        return arr;
    }

    static int[][] appArray(int[][] arr, int i, int start, int end, int value) {
        for (int j = start - 1; j <= end - 1; j++) {
            arr[i][j] = value;

        }
        return arr;
    }

    static int[] add(int[][] num, int n) {
        int[] ans = new int[n];
        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < num.length; row++) {
                sum = sum + num[row][col];
                ans[col] = sum;
                sum = 0;
            }

        }
        return ans;
    }
}
