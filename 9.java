class Matrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            int rSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rSum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + rSum);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int cSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                cSum += arr[j][i];
            }
            System.out.println("Sum of Column " + (i + 1) + " = " + cSum);
        }
    }
}