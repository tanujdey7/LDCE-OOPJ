/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) {
        int arr1[][] = { { 7, 2, 3 }, { 3, 4, 5 }, { 5, 3, 7 } };
        int arr2[][] = { { 3, 9, 0 }, { 5, 3, 7 }, { 5, 3, 7 } };
        int arr3[][] = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }   
    }
}