import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MAP {
    public static void main(String[] args) {
        Map<String, Integer> students = new Hashtable();

        students.put("Yusuf", 56);
        students.put("Nicola", 23);
        students.put("Gabriel", 67);
        students.put("Jasmine", 92);
        students.put("Nicola", 45);

        System.out.println("All the results: " + students);
        System.out.println("A Specific key result: " + students.get("Yusuf"));

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
