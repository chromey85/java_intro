import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // to Double the even numbers in the array

        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }

        // System.out.println(nums);
        // System.out.println(sum);

        // to print the integers in the array separately with a normal for loop
        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        // to print the integers in the array separately with a enhanced for loop
        // for (int n : nums) {
        // System.out.println(n);
        // }

        // Another way is to use a forEach method
        // nums.forEach(n -> System.out.println(n));

        // This is the long version of the .forEach method
        // Consumer<Integer> con = new Consumer<Integer>() {
        // public void accept(Integer n)
        // {
        // System.out.println(n);
        // }
        // };
        // nums.forEach(con);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);

        // s1.forEach(n -> System.out.println(n));
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
        // System.out.println(result);

        // int result = nums.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (c, e) -> c + e);

        // System.out.println(result);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));

    }
}