class demo {
    public static void main(String[] args) {
        int arr1[][] = { { 7, 2, 3 }, { 3, 4, 5 } };
        int arr2[][] = { { 3, 9, 0 }, { 5, 3, 7 } };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] * arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}