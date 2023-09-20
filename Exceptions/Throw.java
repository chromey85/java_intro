// class YusufException extends Exception {
//     public YusufException(String string) {
//         super(string);
//     }
// }

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");

    }
}

public class Throw {

    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // int i = 20;
        // int j = 0;

        // try {
        // j = 18 / i;
        // if (j == 0) {
        // throw new YusufException("we don't like zeros");
        // }
        // } catch (YusufException e) {
        // // System.out.println("Cannot divide by Zero"); // instead of showing an
        // error
        // // message, you can handle the error with a default code
        // j = 18 / 1;
        // System.out.println("Here's a default message" + e);
        // } catch (Exception e) {
        // System.out.println("Something unknown went wrong" + e);
        // }
        // System.out.println(j);

        // System.out.println("bye");
    }
}
