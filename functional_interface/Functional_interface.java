
@FunctionalInterface // FunctionalInterface only has 1 method in it
// interface A {
// void show(int i);
// }

// class B implements A {
// public void show() {
// System.out.println("in Show");
// }
// }

interface A {
    int add(int i, int j);
}

public class Functional_interface {
    public static void main(String[] args) {

        // A obj = new A() {

        // public void show(int i) {
        // System.out.println("in Show " + i);
        // }

        // };

        // this is called a Lambda Function, it replaces the 'new A', like arrow
        // function in js.

        // A obj = (i) -> System.out.println("in Show " + i);

        // obj.show(5);

        // old code

        // A obj = new A() {

        // public int add(int i, int j)

        // {
        // return i + j;
        // }
        // };

        // New code with Lambda expression

        A obj = (int i, int j) -> i + j;

        int result = obj.add(5, 4);
        System.out.println(result);

    }
}