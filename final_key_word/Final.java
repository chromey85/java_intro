// final = the same as Const, can be used in variable, method and class

class Calc {
    public void show() {
        System.out.println("By Yusuf");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {
    public void show() {
        System.out.println("By Gabriel"); // This would override line 5, but to stop this, you make the method final (a
                                          // CONST value)
    }
}

public class Final {
    public static void main(String[] args) {

        // // Final Variable

        // final int num = 8;
        // num = 9;

        // System.out.println(num);

        // Calc obj = new Calc();
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 5);
    }
}
