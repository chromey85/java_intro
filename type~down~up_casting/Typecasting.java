class A {
    public void show1() {
        System.out.println("in show A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in show B");
    }
}

public class Typecasting { // Typecasting is converting the TYPE of the value
    public static void main(String a[]) {
        // double d = 4.5;
        // int i = (int)d;

        // System.out.println(i);

        A obj = (A) new B(); // This is UPCASTING, object is from B but refer to the type from A
        obj.show1();

        B obj1 = (B) obj; // This is DOWNCASTING
        obj1.show2();

    }
}