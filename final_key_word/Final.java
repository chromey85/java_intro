// final = the same as Const, can be used in variable, method and class

class Calc {
    public void show() {
        System.out.println("in CALC show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class Final {
    public static void main(String[] args) {

        // // Final Variable

        // final int num = 8;
        // num = 9;

        // System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }
}
