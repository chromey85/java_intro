// class A {
//     int age;

//     public void show() {
//         System.out.println("in Show");
//     }

//     static class B { // static is only used in inner class
//         public void config() {
//             System.out.println("in Config");
//         }
//     }

// }

// Anonymous inner class

class A {
    public void show() {
        System.out.println("in A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B Show");
    }
}

public class Inner_Class {
    public static void main(String a[]) {
        // A obj = new A();
        // obj.show();

        // // A.B obj1 = obj.new B(); // This is when the inner class is not Static
        // A.B obj1 = new A.B();
        // obj1.config();

        // Anonymous Inner class

        A obj = new B();
        A obj1 = new A() {
            public void show() { // This is how you make an anonymous class, like a 1 time class thats not going
                                 // to be reused
                System.out.println("in A NEW Show");
            }
        };
        obj.show();
        obj1.show();

    }
}
