import other.*;

class E extends C {
    public void abc() {
        System.out.println(marks);
    }
}

public class packages {
    public static void main(String[] args) {

        C obj = new C();
        System.out.println(obj.marks);

        D obj1 = new D();
        System.out.println(obj1.marks);
    }
}
