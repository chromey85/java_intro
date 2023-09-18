// class to class ==> extends
// interface to interface ==> extends
// class to interface ==> implements 

interface A {

    int age = 38;
    String area = "Manchester"; // All declared variable in the interface are FINAL and STATIC

    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {

    public void show() {
        System.out.println("in NEW Show A ");
    }

    public void config() {
        System.out.println("in NEW config A ");
    }

    public void run() {
        System.out.println("Running...");
    }
}

public class Abstract_and_interface {

    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        // A.area = "Liverpool"; // The Variable cannot be changed because it is FINAL
        // and STATIC in the
        // INTERFACE

        // System.out.println(A.area);
        // System.out.println(A.age);
        // System.out.println(A.run);
    }
}