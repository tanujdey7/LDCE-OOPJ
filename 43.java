import java.util.*;
import java.util.function.*;

class Counter {

  public static <T> int countIf(Collection<T> c, Predicate<T> p) {
    int count = 0;
    for (T elem : c) if (p.test(elem)) ++count;
    return count;
  }
}

class Operation {

  public static boolean checkEvenNumber(final int num) {
    return num % 2 == 0;
  }

  public static boolean checkOddNumber(final int num) {
    return num % 2 != 0;
  }

  public static boolean checkPrimeNumber(final int num) {
    if (num == 0 || num == 1) {
      return false;
    }
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkPalindrome(final String word) {
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkPalindrome(Integer num) {
    int r, sum = 0, temp;
    temp = num;
    while (num > 0) {
      r = num % 10;
      sum = (sum * 10) + r;
      num = num / 10;
    }
    return (temp == sum);
  }

  public static boolean checkArmstrongNumber(Integer num) {
    int r, sum = 0, temp;
    temp = num;
    while (num > 0) {
      r = num % 10;
      sum = sum + (r * r * r);
      num = num / 10;
    }
    return (temp == sum);
  }
}

interface UnaryPredicate<T> {
  public boolean test(T obj);
}

final class Algorithm {

  public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
    int count = 0;
    for (T elem : c) if (p.test(elem)) ++count;
    return count;
  }
}

class OddPredicate implements UnaryPredicate<Integer> {

  public boolean test(Integer num) {
    return num % 2 != 0;
  }
}

class EvenPredicate implements UnaryPredicate<Integer> {

  public boolean test(Integer num) {
    return num % 2 == 0;
  }
}

class PrimePredicate implements UnaryPredicate<Integer> {

  public boolean test(Integer num) {
    if (num == 0 || num == 1) {
      return false;
    }
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

class PalindromePredicate implements UnaryPredicate<Integer> {

  public boolean test(Integer num) {
    int r, sum = 0, temp;
    temp = num;
    while (num > 0) {
      r = num % 10; //getting remainder
      sum = (sum * 10) + r;
      num = num / 10;
    }
    return (temp == sum);
  }
}

class PalindromeStringPredicate implements UnaryPredicate<String> {

  public boolean test(final String word) {
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}

class ArmstrongPredicate implements UnaryPredicate<Integer> {

  public boolean test(Integer num) {
    int r, sum = 0, temp;
    temp = num;
    while (num > 0) {
      r = num % 10; //getting remainder
      sum = sum + (r * r * r);
      num = num / 10;
    }
    return (temp == sum);
  }
}

class demo {

  public static void main(String[] args) {
    Collection<Integer> ci = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10, 153);
    int count = -1;
    count = Algorithm.countIf(ci, new OddPredicate());
    System.out.println("Number of odd : " + count);
    count = Algorithm.countIf(ci, new EvenPredicate());
    System.out.println("Number of even : " + count);
    count = Algorithm.countIf(ci, new PrimePredicate());
    System.out.println("Number of prime : " + count);
    count = Algorithm.countIf(ci, new PalindromePredicate());
    System.out.println("Number of Palindrome : " + count);
    count = Algorithm.countIf(ci, new ArmstrongPredicate());
    System.out.println("Number of Armstrong : " + count);
    List<String> cs = Arrays.asList("madam", "test", "tacocat", "hello");
    count = Algorithm.countIf(cs, new PalindromeStringPredicate());
    System.out.println("Number of Palindrome : " + count);
  }
}
