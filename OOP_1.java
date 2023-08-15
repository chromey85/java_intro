
public class OOP_1 {
    public static void main(String[] args) {
        AdvCalc1 obj = new AdvCalc1();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(5, 3);
        int r4 = obj.div(15, 4);
        double r5 = obj.power(4, 2);
        System.out.println(" Add " + r1 + " Minus " + r2 + " Multi " + r3 + " Divide " + r4 + " Power " + r5);
    }
}
