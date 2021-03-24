import java.util.Comparator;

// import java.util.Arrays;

// class demo {

//   public static <E> void printArray(E[] inputArray) {
//     for (E element : inputArray) {
//       System.out.printf("%s ", element);
//     }
//   }

//   public static void main(String args[]) {
//     Integer[] intArray = { 5, 2, 6, 9, 0, 1 };
//     System.out.println("Array integerArray contains:");
//     printArray(intArray);
//   }
// }

class demo {

  public static <T> void selectionSort(T[] arr, Comparator<? super T> comp) {
    for (int i = 0; i < arr.length - 1; ++i) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; ++j) {
        if (comp.compare(arr[j], arr[minIndex]) < 0) {
          minIndex = j;
        }
      }
      T temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

  public static void main(String args[]) {
    Integer[] intArray = { 5, 2, 6, 9, 0, 1 };
    System.out.println("Array integerArray contains:");
    selectionSort(intArray);
  }
}
