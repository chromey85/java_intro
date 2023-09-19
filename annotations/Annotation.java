
class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Shown in A");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Shown in B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();

    }
}