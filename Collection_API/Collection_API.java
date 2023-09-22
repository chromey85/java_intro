import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection_API {

    public static void main(String[] args) {

        // Collection<Integer> nums = new ArrayList<Integer>(); // Collection is used to
        // just store values, add and collect, for indexed values, use LIST
        // List<Integer> nums = new ArrayList<Integer>();
        Set<Integer> nums = new HashSet<Integer>(); // Set is a collection has no index value, it is a collection of
                                                    // unique values, i.e, no duplicate values. to sort the values, use
                                                    // TREESET instead of HASHSET
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        // System.out.println(nums.get(2));

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {

            System.out.println(values.next());
        }

        for (int n : nums) {

            System.out.println("OLD " + n);
        }
    }
}