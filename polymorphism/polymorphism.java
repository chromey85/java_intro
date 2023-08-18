class A {
    public void show() {
        System.out.println("on A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("on B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("on C show");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}