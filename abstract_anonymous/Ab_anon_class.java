abstract class A {
    abstract public void show();

    abstract public void config();
}

// class B extends A {

// public void show() {
// System.out.println("in Show B");
// }

// }

public class Ab_anon_class {

    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in NEW Show A");
            }

            public void config() {
                System.out.print("in NEW config A");
            }
        };
        obj.show();
        obj.config();

    };

}