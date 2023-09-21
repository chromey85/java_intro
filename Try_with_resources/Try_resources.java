import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_resources {

    public static void main(String[] args) throws IOException {

        // int i = 0;
        // int j = 0;

        int num = 0;
        // BufferedReader br = null;
        // ----- One way of doing it is using Try Catch but you have to close with
        // .close() -------//
        // try {
        // // j = 18 / i;
        // // System.out.println("This will only print if the code doesn't trigger the
        // // exception");

        // br = new BufferedReader(new InputStreamReader(System.in));
        // num = Integer.parseInt(br.readLine());
        // System.out.println(num);
        // }

        // // catch (Exception e) {
        // // System.out.println("Something went wrong");
        // // }
        // finally {
        // // System.out.println("This will print regardless of the exception");
        // br.close();
        // }

        // ------- but you can use Try Resource, this closes the Input Stream
        // automatically -------//

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}