import java.util.*;

class Sorting {

  public static <T> void swap(T[] array, int left, int right) {
    T temp = array[right];
    array[right] = array[left];
    array[left] = temp;
  }

  public static <T> void display(T[] array) {
    for (T elem : array) {
      System.out.println("" + elem);
    }
  }
}

class demo {

  public static void main(String[] args) {
    Integer[] nums = { 5, 12, 3, 7, 2 };
    Sorting.display(nums);
    System.out.println();
    Sorting.swap(nums, 0, 1);
    Sorting.display(nums);
  }
}
