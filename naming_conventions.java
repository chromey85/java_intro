// the following follows Camel Casing rules

// Class and interface, e.g Calc, Runable - These have a capital letter at the beginning.
// Variable and Methods e.g marks, show() - These are in lowercase
// Constants e.g PIE, BRAND - something that is constant

//

class A {

    public A() {
        System.out.println("Object Created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class naming_conventions {
    public static void main(String[] args) {

        new A(); // This is a anonymous object and can only be used once
        new A().show();
        new A().show();
    }
}
