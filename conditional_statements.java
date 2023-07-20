public class conditional_statements {
    public static void main(String[] args) {

        // // ----------------if statements

        int x = 8;
        String result = "";

        // if (x > 10) {

        // System.out.println("Thats right");
        // System.out.println("its bigger");

        // }

        // else

        // System.out.println("Thats wrong");

        // if (x % 2 == 0)
        // result = "It's Even";
        // else
        // result = "It's Odd";

        // System.out.println(result);

        // // --------------------- Ternary operator

        // result = x % 2 == 0 ? "Its Even" : "Its Odd";
        // System.out.println(result);

        // // ------------------ switch Statements

        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("There are only 7 days in a week so pick a number between 1 and 7");
                break;
        }

    }
}
