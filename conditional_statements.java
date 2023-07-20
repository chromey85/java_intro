public class conditional_statements {
    public static void main(String[] args) {

        int x = 0;
        String result = "";

        // if (x > 10) {

        // System.out.println("Thats right");
        // System.out.println("its bigger");

        // }

        // else

        // System.out.println("Thats wrong");

        if (x % 2 == 0)
            result = "It's Even";
        else
            result = "It's Odd";

        System.out.println(result);
    }
}
