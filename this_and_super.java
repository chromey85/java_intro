class A { // This is a SuperClass
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in A int");
    }
}

class B extends A { // B is a SubClass
    public B() {
        System.out.println("in B");
    }

    public B(int n) {
        System.out.println("in B int");
    }
}

public class this_and_super {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
